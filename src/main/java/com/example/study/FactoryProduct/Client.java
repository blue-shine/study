package com.example.study.FactoryProduct;

public class Client {
    public static void main(String[] args) {
//        IFactory factory = new Factory();
//        IProduct product = factory.createProduct();
        Product product = new Product();
        product.productMethod();
    }
}
