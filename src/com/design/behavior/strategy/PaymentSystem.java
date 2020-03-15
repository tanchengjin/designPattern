package com.design.behavior.strategy;

public class PaymentSystem {
    private Payment payment;

    public PaymentSystem(Payment payment) {
        this.payment = payment;
    }

    public void execute(){
        payment.pay();
    }
}
