package me.yanrs.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void myBefore(JoinPoint joinPoint){
        System.out.println("方法名称 " + joinPoint.getSignature().getName());
        System.out.println("前置通知");
    }

    public void myAfterReturning(JoinPoint joinPoint){
        System.out.println("方法名称 " + joinPoint.getSignature().getName());
        System.out.println("后置通知");
    }

    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("前置通知");
        // 放行
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("后置通知");
        return obj;
    }
}
