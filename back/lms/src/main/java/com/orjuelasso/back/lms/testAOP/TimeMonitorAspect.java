package com.orjuelasso.back.lms.testAOP;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMonitorAspect {
    @Around("@annotation(com.orjuelasso.back.lms.testAOP.TimeMonitor)")
    public Object monitorTime(org.aspectj.lang.ProceedingJoinPoint joinPoint) throws Throwable {
        Long start=System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        Long execution=System.currentTimeMillis()-start;
        System.out.println("Time taken by "+joinPoint.getSignature()+" is:"+execution+"ms");
        return proceed;
    }}
