package com.feign.http;

import com.feign.FeignDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FeignHttpClientTest
 *
 * @author liuruizhi
 * @Date 2021/8/10
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FeignDemoApplication.class)
public class FeignHttpClientTest {

    @Autowired
    private FeignHttpClient feignHttpClient;

    @Test
    public void httpTest() {
        System.out.println("test");
        feignHttpClient.get("sleep", 10);
    }
}
