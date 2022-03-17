package com.fengyi.pattern.template;

/**
 * @author fengyi
 * @version 创建时间：2022/3/17 14:31
 * @description: 普通冰箱
 */
public class OrdinaryFridge extends Fridge {

    @Override
    public void open() {
        System.out.println("普通冰箱打开冰箱门：亲自用手打开");
    }

    @Override
    public void close() {
        System.out.println("普通冰箱关闭冰箱门：亲自用手关闭");
    }
}
