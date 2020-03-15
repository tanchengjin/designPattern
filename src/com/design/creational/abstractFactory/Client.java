package com.design.creational.abstractFactory;

public class Client {
    public static void main(String[] args) {
        SmartDevice smartDevice=new HuaweiFactory();
        smartDevice.makePhone().produce();
        smartDevice.makeWatch().produce();
    }
}
