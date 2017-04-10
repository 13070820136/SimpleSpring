package com.demo;

/**
 * Created by yu on 2017/4/10.
 */
public class Test {

    @org.junit.Test
    public void test(){

        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new HelloService());
        beanFactory.registerBeanDefinition("helloWorld",beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloWorld");
        helloService.sayHello();

    }

}
