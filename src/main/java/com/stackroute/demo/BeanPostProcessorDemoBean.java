package com.stackroute.demo;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean,String beanName)
    {
        System.out.println("Before initialisation, Bean name is "+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean,String beanName)
    {
        System.out.println("After initialisation, Bean name is "+beanName);
        return bean;
    }
}
