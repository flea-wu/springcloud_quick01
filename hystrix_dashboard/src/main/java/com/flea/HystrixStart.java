package com.flea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-03-08 21:38
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixStart {
    public static void main(String[] args) {
        SpringApplication.run(HystrixStart.class, args);
    }
}
