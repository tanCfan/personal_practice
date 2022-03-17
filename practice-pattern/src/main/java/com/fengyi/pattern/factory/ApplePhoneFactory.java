package com.fengyi.pattern.factory;

/**
 * @author fengyi
 * @version 创建时间：2022/3/17 15:40
 * @description: 苹果手机工厂
 */
public class ApplePhoneFactory extends PhoneFactory{

    @Override
    public void createMotherboard() {
        System.out.println("制作苹果手机主板");
    }

    @Override
    public void createShell() {
        System.out.println("制作苹果手机外壳");
    }

    @Override
    public Phone assemble() {
        return new ApplePhone();
    }
}
