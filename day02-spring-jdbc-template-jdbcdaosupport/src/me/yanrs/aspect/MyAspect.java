package me.yanrs.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component  // 相当于之前 bean 中配置的切面类
@Aspect     // 相当于之前 bean 中配置的 <aop: aspect>
public class MyAspect {

    @Pointcut("execution(* me.yanrs.service.UserServiceImpl.*(..))")
    public void myPointcut(){
        // 声明一个公共的切入点
    }

    @Before("myPointcut()")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("方法名称 " + joinPoint.getSignature().getName());
        System.out.println("前置通知");
    }

    @AfterReturning(pointcut = "myPointcut()", returning = "returnValue")
    public void myAfterReturning(JoinPoint joinPoint, Object returnValue){

        System.out.println("方法名称 " + joinPoint.getSignature().getName());
        System.out.println("后置通知");
        System.out.println("后置通知接收到的返回值：" + returnValue);
    }

    @Around("myPointcut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around 前置通知");
        // 放行（ProceedingJoinPoint 和 JoinPoint的区别在于，JoinPoint 不能放行）
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("Around 后置通知");
        return obj;
    }

    @AfterThrowing(value = "myPointcut()", throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e){
        System.out.println("异常通知：" + joinPoint.getSignature().getName() +"----"+ e.getMessage());
    }

    @After("myPointcut()")
    public void myAfter(JoinPoint joinPoint){
        // 不管有没有异常，最终通知都会执行
        System.out.println("最终通知" + joinPoint.getSignature().getName());
    }
}
