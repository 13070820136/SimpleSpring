package com.demo;

/**
 * Created by yu on 2017/4/9.
 */
public class BeanDefinition {

    private Object bean;
    private Class beanClass;
    private String clssName;

    public BeanDefinition() {

    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getClssName() {
        return clssName;
    }

    public void setClssName(String clssName) {
        this.clssName = clssName;
        try {
            this.beanClass = Class.forName(clssName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
