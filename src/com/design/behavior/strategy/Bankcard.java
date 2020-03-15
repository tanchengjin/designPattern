package com.design.behavior.strategy;

public class Bankcard implements Payment {
    @Override
    public void pay() {
        System.out.println("使用银行卡付款");
    }
}
