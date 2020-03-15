package com.design.creational.factoryMethod;

public class Xiaomi implements Phone{
    @Override
    public void produce() {
        System.out.println("生产小米手机");
    }
}
