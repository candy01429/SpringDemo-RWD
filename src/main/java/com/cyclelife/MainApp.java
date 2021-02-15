
package com.cyclelife;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp { // 啟動Spring
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-cycle.xml");
        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.getMessage();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
