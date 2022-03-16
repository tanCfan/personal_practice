package com.fengyi.pattern.adapter;

/**
 * @author fengyi
 * @version 创建时间：2022/3/16 16:07
 * @description: 三孔插头
 */
public class ThreeHolePlugs {

    /**
     * 电
     */
    private String power;

    public ThreeHolePlugs (String power) {
        this.power = power;
    }

    public void plugIntoThreeHoleSocket() {
        System.out.println(power);
    }
}
