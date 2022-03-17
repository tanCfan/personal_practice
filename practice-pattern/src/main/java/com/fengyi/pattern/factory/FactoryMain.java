package com.fengyi.pattern.factory;

/**
 * @author fengyi
 * @version 创建时间：2022/3/17 15:39
 * @description: 工厂方法测试
 */
public class FactoryMain {

    public static void main(String[] args) {
        System.out.println("=============== 工厂方法 begin ===============");

        PhoneFactory miPhoneFactory = new MiPhoneFactory();
        PhoneFactory applePhoneFactory = new ApplePhoneFactory();

        Phone miPhone = miPhoneFactory.createPhone();
        miPhone.use();

        System.out.println();

        Phone applePhone = applePhoneFactory.createPhone();
        applePhone.use();

        System.out.println("=============== 工厂方法 end ===============");
    }
}
