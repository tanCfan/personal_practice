package com.fengyi.pattern.factory;

/**
 * @author fengyi
 * @version 创建时间：2022/3/17 15:41
 * @description: 小米手机
 */
public class MiPhone extends Phone{


    @Override
    public void use() {
        System.out.println("欢迎使用小米手机");
    }
}
