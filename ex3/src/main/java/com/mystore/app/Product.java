package com.mystore.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private int id;
    private String name;
    private String barcode;

    private final Barcode barcodeGenerator;

    @Autowired
    public Product(Barcode barcodeGenerator) {
        this.barcodeGenerator = barcodeGenerator;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', barcode='" + barcode + "'}";
    }
}
