package com.design.creational.factoryMethod;

public class XiaomiPhoneFactory extends PhoneFactory{
    @Override
    public Phone makePhone() {
        return new Xiaomi();
    }
}
