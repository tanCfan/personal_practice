package com.fengyi.pattern.template;

/**
 * @author fengyi
 * @version 创建时间：2022/3/17 14:27
 * @description: 冰箱抽象类
 */
public abstract class Fridge {

    /**
     * 打开冰箱
     */
    public abstract void open ();

    /**
     * 关闭
     */
    public abstract void close();

    /**
     * 放入物品
     */
    public abstract void putIn();

    /**
     * 冰箱存储物品
     */
    public void storage () {
        // 打开冰箱门
        open();

        // 放入物品
        putIn();

        // 关闭冰箱门
        close();
    }
}
