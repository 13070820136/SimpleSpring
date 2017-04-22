package com.demo;

import com.demo.com.demo.factory.AutowireCapableBeanFactory;
import com.demo.com.demo.factory.BeanFactory;
import org.junit.Test;

/**
 * Created by yu on 2017/4/20.
 */
public class BeanFactoryTest {

    @Test
    public void test() {
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setClssName("com.demo.HelloService");
        //实例化工厂
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        //注入
        Propertis propertis = new Propertis();
        propertis.addProperties(new Property("text", "hello word"));
        beanDefinition.setPropertis(propertis);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //使用
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }

}
