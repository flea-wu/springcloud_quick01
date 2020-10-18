package com.flea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-03-10 23:33
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigStart {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigStart.class, args);
    }
}
