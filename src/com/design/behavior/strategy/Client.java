package com.design.behavior.strategy;

public class Client {
    public static void main(String[] args) {
        PaymentSystem paymentSystem=null;

        String paymentType="alipay";

        if("alipay".equalsIgnoreCase(paymentType)){
            paymentSystem=new PaymentSystem(new Alipay());
        }else if("bankcard".equalsIgnoreCase(paymentType)){
            paymentSystem=new PaymentSystem(new Bankcard());
        }else if("wechatpay".equalsIgnoreCase(paymentType)){
            paymentSystem=new PaymentSystem(new Wechatpay());
        }
        paymentSystem.execute();
    }
}
