package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLifecycleDemoBean implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    ApplicationContextAware applicationContextAware;
    BeanNameAware beanNameAware;
    BeanFactoryAware beanFactoryAware;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactoryAware=beanFactoryAware;
    }

    public void setBeanName(String s) {
        System.out.println("Bean name is "+s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContextAware=applicationContextAware;
    }
}
