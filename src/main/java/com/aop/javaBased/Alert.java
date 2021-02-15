package com.aop.javaBased;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // AOP 註解
public class Alert {

    @Before("execution(* com.og.Soldier.destoryTarget(..))") // 在destoryTarget()執行前被Spring調用
    public void beforeAttack() {
        System.out.println("Before Attack...");
    }

    @After("execution(* com.og.Soldier.destoryTarget(..))") // 在destoryTarget()執行後被Spring調用
    public void afterAttack() {
        System.out.println("After Attack...");
    }
}
