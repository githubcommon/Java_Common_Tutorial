package com.murali.springboot.scheduler.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murali.springboot.scheduler.api.model.User;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 17, 2021 8:39:33 PM  
 * @version:2.x
 */
public interface UserDao extends JpaRepository<User, Integer> {

}
