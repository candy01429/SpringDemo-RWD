package com.aop;

import com.di.Gun;
import com.di.Weapon;
import com.og.Soldier;

public class MySoldierNG implements Soldier { // 建立類別,實作Soldier

    Weapon weapon;
    Alert alert;

    public MySoldierNG(Weapon w, Alert a) {
        this.weapon = w;
        this.alert = a;
    }

    @Override
    public void destoryTarget() {
        this.alert.beforeAttack();
        this.weapon.attack();
        this.alert.afterAttack();
    }

}
