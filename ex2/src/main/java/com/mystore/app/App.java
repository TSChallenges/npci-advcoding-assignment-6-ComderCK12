package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] arg) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.scan("com.mystore.app");
        // context.refresh();

        Product product1 = context.getBean("tumblerProduct", Product.class);
        Product product2 = context.getBean("bucketProduct", Product.class);

        System.out.println(product1);
        System.out.println(product2);

        context.close();
    }
}