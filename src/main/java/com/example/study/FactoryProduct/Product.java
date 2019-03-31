package com.example.study.FactoryProduct;

public class Product implements IProduct{
    @Override
    public void productMethod() {
        System.out.println("输出产品");
    }
}
