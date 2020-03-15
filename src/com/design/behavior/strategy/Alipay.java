package com.design.behavior.strategy;

public class Alipay implements Payment {
    @Override
    public void pay() {
        System.out.println("使用支付宝支付");
    }
}
