package com.fengyi.pattern.singleton;

import java.util.Objects;

/**
 * @author fengyi
 * @version 创建时间：2022/3/18 17:46
 * @description: 懒汉单例模式
 */
public class LazySingletonDemo {

    /**
     * 名称
     */
    private String name;

    /**
     * 单例对象
     */
    private static LazySingletonDemo instance;

    private LazySingletonDemo () {

    }

    public static LazySingletonDemo getInstance () {
        if (Objects.isNull(instance)) {
            instance = new LazySingletonDemo();

        }
        return instance;
    }
}
