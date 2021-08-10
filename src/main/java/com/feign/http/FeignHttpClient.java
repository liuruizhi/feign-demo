package com.feign.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FeignHttpClient
 *
 * @author liuruizhi
 * @Date 2021/8/10
 **/
@FeignClient(value = "localhost")
public interface FeignHttpClient {

    @RequestMapping(method = RequestMethod.GET)
    String get(String sleep, int time);
}
