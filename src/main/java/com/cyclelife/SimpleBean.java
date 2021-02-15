package com.cyclelife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SimpleBean implements
        BeanNameAware,
        BeanFactoryAware,
        ApplicationContextAware,
        InitializingBean,
        DisposableBean {

    private String message;
    private int order;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setBeanName(String arg0) {
        System.out.println(++order + ": setBeanName()");
    }

    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out.println(++order + ": setBeanFactory()");
    }

    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        System.out.println(++order + ": setApplicationContext()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(++order + ": afterPropertiesSet() | init()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(++order + ": destroy()");
    }

    // from xml setting
    public void myInit() throws Exception {
        System.out.println(++order + ": myInit()");
    }

    // from xml setting
    public void myDestroy() throws Exception {
        System.out.println(++order + ": myDestroy()");
    }

}
