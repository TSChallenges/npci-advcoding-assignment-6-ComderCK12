package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "tumblerProduct")
    public Product tumbler() {
        Product product = new Product();
        product.setId(1);
        product.setName("Tumbler");
        return product;
    }

    @Bean(name = "bucketProduct")
    public Product bucketProduct() {
        Product product = new Product();
        product.setId(2);
        product.setName("Bucket");
        return product;
    }
}
