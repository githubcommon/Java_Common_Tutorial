package com.murali.springboot.swagger.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murali.springboot.swagger.api.model.Book;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 18, 2021 12:38:36 AM
 * @version:2.x
 */
public interface BookRepository extends JpaRepository<Book, Integer> {

}
