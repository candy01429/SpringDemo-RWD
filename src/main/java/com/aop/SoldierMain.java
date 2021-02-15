package com.aop;

import com.di.Gun;
import com.di.Weapon;

public class SoldierMain {

    public static void main(String[] args) {
        Weapon w = new Gun();
        Alert a = new Alert();
        new MySoldierNG(w, a).destoryTarget();
    }
}
