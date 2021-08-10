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
@FeignClient(url = "localhost", name = "test")
public interface FeignHttpClient {

    @RequestMapping(method = RequestMethod.GET, value = "get")
    String get(@RequestParam("sleep") String sleep, @RequestParam("time") int time);

    @RequestMapping(method = RequestMethod.GET, value = "get2")
    String get2(@RequestParam("sleep") String sleep, @RequestParam("time") int time);
}
