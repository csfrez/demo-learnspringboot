package com.csfrez.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

//@Component
@Aspect
public class LogAspect {

    // 切入com.csfrez.demo下面的一级包下面的所有类的所有方法
    @Before("execution(public * com.csfrez.demo.service.*.*(..))")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("doBefore run...");
    }

    // 切入被@LogBack标注的方法
    @After("@annotation(com.csfrez.demo.annotation.LogBack)")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("doAfter run...");
    }

    // 切入com.csfrez.demo.service.DemoService类的所有方法中第一个参数为String类型的方法
    @AfterReturning(value = "execution(public * com.csfrez.demo.service.DemoService.*(java.lang.String, ..))", returning = "result")
    public void doAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("doAfterReturning run, result: " + result);
    }

    // 切入com.csfrez.demo下所有的controller包下面的所有类的所有方法
    @AfterThrowing(value = "execution(public * com.csfrez.demo..controller.*.*(..))", throwing = "rex")
    public void doAfterThrowing(JoinPoint joinPoint, RuntimeException rex) {
        System.out.println("doAfterThrowing catch exception: " + rex.getMessage());
    }

    // 切入com.csfrez.demo.service.DemoService的所有返回值为String的方法
    @Around("execution(public String com.csfrez.demo.service.DemoService.*(..))")
    public Object doAround(ProceedingJoinPoint joinPoint) {
        System.out.println("doAround run...");
        Object result = null;
        try {
            System.out.println("method before invoke...");
            result = joinPoint.proceed();
            System.out.println("method after invoke, result: " + result);
        } catch (Throwable throwable) {
            System.out.println("method throws Exception: " + throwable.getMessage());
            throwable.printStackTrace();
        }
        return result;
    }

}