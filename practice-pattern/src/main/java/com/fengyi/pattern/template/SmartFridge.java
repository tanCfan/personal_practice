package com.fengyi.pattern.template;

/**
 * @author fengyi
 * @version 创建时间：2022/3/17 14:31
 * @description: 普通冰箱
 */
public class SmartFridge extends Fridge {

    @Override
    public void open() {
        System.out.println("智能冰箱打开冰箱门：通过语音打开");
    }

    @Override
    public void close() {
        System.out.println("智能冰箱关闭冰箱门：通过语音关闭");
    }

    @Override
    public void putIn() {
        System.out.println("智能冰箱放入物品：亲自用手放入物品");
    }
}
