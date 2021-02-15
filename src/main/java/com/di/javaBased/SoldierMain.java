package com.di.javaBased;

import com.og.Soldier;
import java.text.Annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


// 使用設定類別啟動Spring框架
public class SoldierMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SoldierConfig.class); // 指定設定類別SoldierConig建立Spring執行環境
		Soldier soldier = context.getBean(Soldier.class); // 利用class指定物件型態,自Spring執行環境取出Soldier元件
		soldier.destoryTarget(); // 執行Soldier元件的destroyTarget()方法
	}
}
