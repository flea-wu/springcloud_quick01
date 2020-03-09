package com.flea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-03-09 21:49
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulStart {
    public static void main(String[] args) {
        SpringApplication.run(ZuulStart.class, args);
    }
}
