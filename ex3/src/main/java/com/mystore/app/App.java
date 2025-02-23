package com.mystore.app;

// import com.mystore.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] arg) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {

            Product product1 = context.getBean(Product.class);
            product1.setId(1);
            product1.setName("Tumbler");

            Product product2 = context.getBean(Product.class);
            product2.setId(2);
            product2.setName("Bucket");

            System.out.println(product1);
            System.out.println(product2);
        }
    }
}