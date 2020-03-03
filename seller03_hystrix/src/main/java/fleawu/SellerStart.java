package fleawu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述:
 *
 * <p>
 *
 * 服务发现设置 ： @EnableDiscoveryClient
 * @author tiaozao
 * @date 2020-02-16 21:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class SellerStart {
    public static void main(String[] args) {
        SpringApplication.run(SellerStart.class, args);
    }
}
