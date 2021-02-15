package com.aop.xmlBased;

import com.og.Soldier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 使用XML設定檔啟動Spring框架
public class SoldierMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-aop.xml"); // 指定xml檔案
        Soldier soldier = context.getBean(Soldier.class); // 利用class指定物件型態,自Spring執行環境取出Soldier元件
        try {
            soldier.destoryTarget(); // 執行Soldier元件的destroyTarget()方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
