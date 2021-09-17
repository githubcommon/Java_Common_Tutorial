package com.murali.springboot.ds.api.model.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.murali.springboot.model.book.Book;
import com.murali.springboot.model.user.User;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 24, 2021 5:10:15 PM
 * @version:2.x
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    void saveAll(List<User> collect);

}
