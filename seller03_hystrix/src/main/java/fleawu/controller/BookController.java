package fleawu.controller;

import com.fleawu.Book;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import fleawu.service.BookService;
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
    @HystrixCommand(fallbackMethod = "erroBook")
    public Book buyBook() {
//        int a = 1 / 0;
        return bookService.sellBook();
    }

    private Book erroBook() {
        return new Book().setName("error book").setPrice(0).setCode(110);
    }
}
