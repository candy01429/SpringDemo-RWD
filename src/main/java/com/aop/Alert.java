package com.aop;

// 建立警示類別Alert,在士兵類別使用武器催會目標的前後,都應警示
public class Alert {

	public void beforeAttack() {
		System.out.println("Before Attack...");
	}
	
	public void afterAttack() {
		System.out.println("After Attack...");
	}
}
