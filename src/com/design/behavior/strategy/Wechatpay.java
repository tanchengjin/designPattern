package com.design.behavior.strategy;

public class Wechatpay implements Payment {
    @Override
    public void pay() {
        System.out.println("使用微信支付");
    }
}
