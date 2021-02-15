package com.aop.javaBased;

import com.di.javaBased.*;
import com.di.Gun;
import com.di.MySoldierOK;
import com.di.Weapon;
import com.og.Soldier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // 宣告為Spring的設定類別
@EnableAspectJAutoProxy // 宣告啟用AOP
public class SoldierConfig {

    @Bean // 表示Spring 啟動時將執行該方法,並將產出的物件納管為bean元件
    public Soldier getSoldier() {
        return new MySoldierOK(getWeapon()); // 建立MySoldierOK物件需要建構子注入Weapon介面的實作物件
    }

    @Bean 
    public Weapon getWeapon() {
        return new Gun();
    }

    @Bean
    public Alert getAlert() {
        return new Alert();
    }
}
