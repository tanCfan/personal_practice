package com.fengyi.pattern.singleton;

/**
 * @author fengyi
 * @version 创建时间：2022/3/18 17:33
 * @description: 单例类
 */
public class SingletonDemo {

    /**
     * 名称
     */
    private String name;

    /**
     * 单例对象
     */
    private static final SingletonDemo INSTANCE = new SingletonDemo();

    private SingletonDemo () {

    }

    public static SingletonDemo getInstance() {
        return INSTANCE;
    }
}
