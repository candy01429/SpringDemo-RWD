package com.aop.javaBased;

import com.aop.MySoldierNG;
import com.di.Gun;
import com.di.Weapon;
import com.og.Soldier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoldierMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SoldierConfig.class);
        Soldier soldier = context.getBean(Soldier.class);
        soldier.destoryTarget();
    }
}
