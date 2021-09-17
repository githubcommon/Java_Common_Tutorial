package com.murali.springboot.swagger.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murali.springboot.swagger.api.model.Book;
import com.murali.springboot.swagger.api.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 18, 2021 12:50:55 AM
 * @version:2.x
 */
@RestController
@RequestMapping("/book")
@Api(value = "Book Service", description = "My Book Store")
public class BookController {
    @Autowired
    private BookService service;

    @PostMapping("/save")
    @ApiOperation(value = "store book api")
    public String saveBook(@RequestBody Book book) {
	return service.saveBook(book);
    }

    @ApiOperation(value = "search book api")
    @GetMapping("/searchBook/{bookId}")
    public Optional<Book> getBook(@PathVariable int bookId) {
	return service.getBook(bookId);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public List<Book> deleteBook(@PathVariable int bookId) {
	return service.removeBook(bookId);

    }

}
