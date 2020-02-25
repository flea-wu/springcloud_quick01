package com.fleawu.eureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-02-18 23:28
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaStart01 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStart01.class, args);
    }
}
