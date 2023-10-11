package com.example.tablelayout2;

public class Product {
    private String code;
    private String name;
    private String price;

    public Product(String code, String name, String price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
