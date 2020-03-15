package com.design.creational.factoryMethod;

public class Client {
    public static void main(String[] args) {
        PhoneFactory phone =new HuaweiPhoneFactory();

        phone.makePhone().produce();

    }
}
