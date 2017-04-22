package com.demo.com.demo.factory;

import com.demo.BeanDefinition;
import com.demo.Property;

import java.lang.reflect.Field;

/**
 * Created by yu on 2017/4/20.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object bean = beanDefinition.getBeanClass().newInstance();
            for (Property p : beanDefinition.getPropertis().getProperties()) {
                Field field = beanDefinition.getBeanClass().getDeclaredField(p.getName());
                field.setAccessible(true);
                field.set(bean, p.getValue());
            }
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

}
