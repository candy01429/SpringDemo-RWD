package com.cyclelife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor { // 呈現bean元件若有實作BeanPostProcessor,對其他bean元件的影響

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
        System.out.println("postProcess Before Initialization: " + arg1);
        return arg0;
    }

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
        System.out.println("postProcess After Initialization: " + arg1);
        return arg0;
    }
}
