package com.murali.springboot.ds.api.config;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 24, 2021 5:53:36 PM
 * @version:2.x
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", basePackages = {
	"com.murali.springboot.ds.api.model.user.repository" })
public class UserDBConfig {
    @Primary
    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.user.datasource")
    public DataSource dataSource() {
	return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
	    @Qualifier("dataSource") DataSource dataSource) {
	HashMap<String, Object> properties = new HashMap<>();
	properties.put("hibernate.hbm2ddl.auto", "update");
	properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	return builder.dataSource(dataSource).properties(properties)
		.packages("com.murali.springboot.model.user").persistenceUnit("User").build();
    }

    @Primary
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(
	    @Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
	return new JpaTransactionManager(entityManagerFactory);
    }
}
