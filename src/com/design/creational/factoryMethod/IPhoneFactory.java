package com.design.creational.factoryMethod;

public class IPhoneFactory extends PhoneFactory{
    @Override
    public Phone makePhone() {
        return new Iphone();
    }
}
