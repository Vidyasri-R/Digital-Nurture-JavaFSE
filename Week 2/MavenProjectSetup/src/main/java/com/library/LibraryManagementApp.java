package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Library Management Application started successfully.");
        System.out.println("Spring Context loaded with " + context.getBeanDefinitionCount() + " beans.");
    }
}
