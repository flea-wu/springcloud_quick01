package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-02-27 01:14
 */
@Configuration
public class MyRule {

    @Bean
    public IRule myRule2() {
        return new RandomRule();
    }

}
