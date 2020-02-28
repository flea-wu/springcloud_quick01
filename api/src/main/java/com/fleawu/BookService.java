package com.fleawu;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PROVIDER")
public interface BookService {

    @GetMapping(value = "/buy/book")
    Book sellBook();

}