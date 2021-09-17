package com.murali.springboot.ds.api.model.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.murali.springboot.model.user.User;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 24, 2021 5:11:02 PM
 * @version:2.x
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
