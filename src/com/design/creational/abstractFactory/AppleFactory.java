package com.design.creational.abstractFactory;

public class AppleFactory implements SmartDevice{
    @Override
    public Phone makePhone() {
        return new Iphone();
    }

    @Override
    public Watch makeWatch() {
        return new AppleWatch();
    }
}
