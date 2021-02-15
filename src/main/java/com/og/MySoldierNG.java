package com.og;

import com.di.Gun;

public class MySoldierNG implements Soldier { // 建立類別,實作Soldier

    Gun weapon;

    public MySoldierNG() {
        this.weapon = new Gun(); // 導致2個類別緊密依賴,失去武器抽換彈性
    }

    @Override
    public void destoryTarget() {
        this.weapon.attack();
    }

    public static void main(String[] args) {
        new MySoldierNG().destoryTarget();
    }
}
