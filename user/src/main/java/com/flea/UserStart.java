package com.flea;

import com.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-02-16 23:08
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PROVIDER",configuration = MyRule.class)
public class UserStart {
    public static void main(String[] args) {
        SpringApplication.run(UserStart.class, args);
    }
}
