package com.fleawu.eureka02;

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
public class EurekaStart02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStart02.class, args);
    }
}
