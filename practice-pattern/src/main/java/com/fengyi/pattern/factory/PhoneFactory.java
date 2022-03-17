package com.fengyi.pattern.factory;

/**
 * @author fengyi
 * @version 创建时间：2022/3/17 15:21
 * @description: 手机工厂
 */
public abstract class PhoneFactory {

    /**
     * 创建主板
     */
    public abstract void createMotherboard();

    /**
     * 创建外壳
     */
    public abstract void createShell();

    /**
     * 组装
     * @return 手机
     */
    public abstract Phone assemble();

    /**
     * 生产手机
     * @return 手机
     */
    public final Phone createPhone() {
        // 生产主板
        createMotherboard();

        // 生产外壳
        createShell();

        // 组装
        return assemble();
    }
}
