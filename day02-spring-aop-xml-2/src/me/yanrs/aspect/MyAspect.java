package me.yanrs.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void myBefore(JoinPoint joinPoint){
        System.out.println("方法名称 " + joinPoint.getSignature().getName());
        System.out.println("前置通知");
    }

    public void myAfterReturning(JoinPoint joinPoint, Object returnValue){
        // 如果后置通知中需要接受返回值，那么就需要在 xml 中配置 returning
        System.out.println("方法名称 " + joinPoint.getSignature().getName());
        System.out.println("后置通知");
        System.out.println("后置通知接收到的返回值：" + returnValue);
    }

    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("前置通知");
        // 放行（ProceedingJoinPoint 和 JoinPoint的区别在于，JoinPoint 不能放行）
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("后置通知");
        return obj;
    }

    public void myAfterThrowing(JoinPoint joinPoint, Throwable e){
        System.out.println("异常通知：" + joinPoint.getSignature().getName() +"----"+ e.getMessage());
    }

    public void myAfter(JoinPoint joinPoint){
        // 不管有没有异常，最终通知都会执行
        System.out.println("最终通知" + joinPoint.getSignature().getName());
    }
}
