package com.flea.controller;

import com.fleawu.Book;
import com.fleawu.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-02-16 23:22
 */
@RestController
public class UserController {

    @Resource
    private BookService bookService;

    @GetMapping(value = "/buybook")
    public Book getuser() {
        return bookService.sellBook();
    }
}
