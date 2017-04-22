package com.demo;

/**
 * Created by yu on 2017/4/10.
 */
public class HelloService {
    private String text;
    public void sayHello() {
        System.out.println("Hello world!");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
