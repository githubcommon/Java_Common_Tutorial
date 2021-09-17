package com.javatechie.multiple.ds.api.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatechie.multiple.ds.api.model.book.Book;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 24, 2021 8:05:15 PM
 * @version:2.x
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
