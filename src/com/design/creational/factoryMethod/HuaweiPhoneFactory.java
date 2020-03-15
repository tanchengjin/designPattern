package com.design.creational.factoryMethod;


public class HuaweiPhoneFactory extends PhoneFactory{
    @Override
    public Phone makePhone() {
        return new HuaweiPhone();
    }
}
