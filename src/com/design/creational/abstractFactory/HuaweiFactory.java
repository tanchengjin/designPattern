package com.design.creational.abstractFactory;

public class HuaweiFactory implements SmartDevice{
    @Override
    public Phone makePhone() {
        return new HuaweiPhone();
    }

    @Override
    public Watch makeWatch() {
        return new HuaweiWatch();
    }
}
