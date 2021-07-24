package com.javatechie.multiple.ds.api.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatechie.multiple.ds.api.model.user.User;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 24, 2021 8:05:54 PM
 * @version:2.x
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
