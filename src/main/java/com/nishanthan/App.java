package com.nishanthan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code();
        System.out.println(obj.getFramework());
        System.out.println(obj.getRole());
        System.out.println(obj.getYoe());

        context.close();
    }
}
