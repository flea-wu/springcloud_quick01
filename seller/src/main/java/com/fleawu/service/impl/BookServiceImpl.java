package com.fleawu.service.impl;

import com.fleawu.Book;
import com.fleawu.service.BookService;
import org.springframework.stereotype.Service;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-02-16 16:49
 */
@Service
public class BookServiceImpl implements BookService {

    @Override
    public Book sellBook() {
        return  new Book().setName("hehe").setPrice(99);
    }
}
