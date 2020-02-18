package com.flea.controller;

import com.fleawu.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    private RestTemplate restTemplate;

    @GetMapping(value = "/buybook")
    public Book getuser() {
        return restTemplate.getForObject("http://127.0.0.1:7001/buy/book", Book.class);
    }
}
