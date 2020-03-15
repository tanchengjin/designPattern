package com.design.creational.factoryMethod;

//定义用于生产手机的工厂
public abstract class PhoneFactory {
    //对外部提供统一接口
    public abstract Phone makePhone();
}
