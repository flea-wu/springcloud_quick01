package com.fleawu;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 描述:
 *
 * <p>
 *  新建一个 BookServiceFallbackFactory 类（名字自定义），传入对应的接口，
 *  实现 FallbackFactory 中的接口，对接口中的方法进行降级处理
 *  【@Component】 必须添加
 * @author tiaozao
 * @date 2020-03-01 23:06
 */
@Component
public class BookServiceFallbackFactory implements FallbackFactory<BookService> {

    @Override
    public BookService create(Throwable throwable) {
        return () -> new Book().setName("服务降级").setPrice(10).setCode(119);
    }
}
