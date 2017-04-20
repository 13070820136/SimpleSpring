package com.demo.com.demo.factory;

import com.demo.BeanDefinition;

/**
 * Created by yu on 2017/4/20.
 */
public interface BeanFactory {
    Object getBean(String beanName);

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
