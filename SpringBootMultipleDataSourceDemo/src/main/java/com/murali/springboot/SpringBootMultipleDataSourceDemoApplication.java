package com.murali.springboot;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murali.springboot.ds.api.model.book.repository.BookRepository;
import com.murali.springboot.ds.api.model.user.repository.UserRepository;
import com.murali.springboot.model.book.Book;
import com.murali.springboot.model.user.User;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 24, 2021 6:10:54 PM  
 * @version:2.x
 */
@SpringBootApplication
@RestController
//@ComponentScan(basePackages = {"com.murali.springboot.*"})
public class SpringBootMultipleDataSourceDemoApplication {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void adddata2DB() {
	userRepository
		.saveAll(Stream.of(new User(747, "Murali"), new User(748, "Naresh")).collect(Collectors.toList()));
	bookRepository.saveAll(
		Stream.of(new User(111, "SpringBoot"), new User(222, "Hibernate")).collect(Collectors.toList()));
    }
    
    @GetMapping("/getUsers")
    public List<User> getUsers() {
	return userRepository.findAll();
    }
    
    @GetMapping("/getBooks")
    public List<Book> getBooks(){
	return bookRepository.findAll();
    }

    public static void main(String[] args) {
	SpringApplication.run(SpringBootMultipleDataSourceDemoApplication.class, args);
    }

}
