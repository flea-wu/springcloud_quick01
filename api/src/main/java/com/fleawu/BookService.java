package com.fleawu;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "PROVIDER", fallbackFactory = BookServiceFallbackFactory.class)
public interface BookService {

    @RequestMapping(value = "/buy/book", method = RequestMethod.GET)
    Book sellBook();

}