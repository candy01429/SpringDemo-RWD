package com.di;

import com.og.Soldier;

public class MySoldierOK implements Soldier { // Soldier的實作類別不會綁定任何實體武器,可視需要抽換

    Weapon weapon; // DI

    public MySoldierOK(Weapon w) {
        this.weapon = w;
    }

    @Override
    public void destoryTarget() {
        this.weapon.attack(); // DI
    }

    public static void main(String[] args) {
        Weapon w = new Gun();
        new MySoldierOK(w).destoryTarget();
    }
}
