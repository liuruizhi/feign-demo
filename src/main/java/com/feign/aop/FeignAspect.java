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
        Class clazz = methodSignature.getMethod().getDeclaringClass();
        Method method = methodSignature.getMethod();
        Class<?>[] classes = methodSignature.getParameterTypes();
        System.out.println(clazz.getName());
        System.out.println(method.getName());
        System.out.println(classes[0].getSimpleName() + "=====" + classes[1].getSimpleName());

        System.out.println("======================");
        // TODO 根据clazz method 参数等获取key，然后初始化Hystrix配置
        try {
            // TODO 通过Hystrix包装调用方法
            // joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
