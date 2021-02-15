package com.di;

// 所有武器,包含Gun,都實作該介面
public class Gun implements Weapon {

    @Override
    public void attack() {
        System.out.println("Gun Shoot");
    }
}
