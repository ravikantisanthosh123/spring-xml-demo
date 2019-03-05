package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import sun.net.ApplicationProxy;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    Actor actor = new Actor();

    ApplicationContextAware applicationContextAware;
    BeanFactoryAware beanFactoryAware;
    BeanNameAware beanNameAware;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
     this.beanFactoryAware=beanFactoryAware;
    }

    public void setBeanName(String s) {
        System.out.println("Bean Name is "+s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContextAware=applicationContextAware;
    }
}
