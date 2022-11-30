package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach anotherCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(theCoach == anotherCoach);
        System.out.println(theCoach);
        System.out.println(anotherCoach);
        context.close();
    }
}
