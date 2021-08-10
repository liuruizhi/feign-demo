package com.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * FeignDemoApplication
 *
 * @author liuruizhi
 * @Date 2021/8/10
 **/
@SpringBootApplication
@EnableFeignClients
public class FeignDemoApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
