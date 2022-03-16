package com.fengyi.pattern.adapter;

/**
 * @author fengyi
 * @version 创建时间：2022/3/16 16:04
 * @description: 适配器模式测试 - 双孔插座 通过适配器 插入 三孔插头
 */
public class AdapterMain {

    public static void main(String[] args) {
        System.out.println("=============== 适配器模式 begin ===============");
        TwoHoleSocket twoHoleSocket = new TwoHoleSocketThreeHolePlugsAdapter("双孔插座接入三孔插头，接通220V电流");
        twoHoleSocket.accessToTwoHolePlug();
        System.out.println("=============== 适配器模式 end ===============");
    }
}
