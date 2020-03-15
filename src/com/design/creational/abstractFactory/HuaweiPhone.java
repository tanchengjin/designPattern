package com.design.creational.abstractFactory;

public class HuaweiPhone implements Phone {

    @Override
    public void produce() {
        System.out.println("生产华为手机");
    }
}
