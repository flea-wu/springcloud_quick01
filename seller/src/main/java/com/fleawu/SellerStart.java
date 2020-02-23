package com.fleawu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-02-16 21:22
 */
@SpringBootApplication
@EnableEurekaClient
public class SellerStart {
    public static void main(String[] args) {
        SpringApplication.run(SellerStart.class, args);
    }
}
