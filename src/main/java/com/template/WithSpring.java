package com.template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WithSpring {

    public static void main(String[] args) {
        String ctxClassPath = "applicationContext-jdbc.xml";
        ApplicationContext clsContext = new ClassPathXmlApplicationContext(ctxClassPath);
        EmployeeDao dao1 = clsContext.getBean(EmployeeDao.class);
        System.out.println(dao1.getEmployeeById(2));
    }
}
