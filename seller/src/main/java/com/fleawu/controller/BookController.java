package com.fleawu.controller;

import com.fleawu.Book;
import com.fleawu.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-02-16 20:49
 */
@RestController
public class BookController {

    @Resource
    private BookService bookService;

    @GetMapping(value = "/buy/book")
    public Book buyBook() {
        return bookService.sellBook();
    }
}
