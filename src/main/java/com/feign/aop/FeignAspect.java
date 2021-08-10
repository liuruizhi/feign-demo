package com.feign.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * FeignAspect
 *
 * @author liuruizhi
 * @Date 2021/8/10
 **/
@Aspect
@Component
public class FeignAspect {

    @Pointcut("@within(org.springframework.cloud.openfeign.FeignClient)")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Class<?>[] classes = methodSignature.getParameterTypes();
        System.out.println("joinpoint");
        return null;
    }
}
