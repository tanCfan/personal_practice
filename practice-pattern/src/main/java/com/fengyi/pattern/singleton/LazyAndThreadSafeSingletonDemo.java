package com.fengyi.pattern.singleton;

/**
 * @author fengyi
 * @version 创建时间：2022/3/18 17:46
 * @description: 懒汉单例模式
 */
public class LazyAndThreadSafeSingletonDemo {

    /**
     * 名称
     */
    private String name;

    private LazyAndThreadSafeSingletonDemo() {

    }

    private static class LazyAndThreadSafeSingletonDemoHolder {
        private static final LazyAndThreadSafeSingletonDemo INSTANCE = new LazyAndThreadSafeSingletonDemo();
    }

    public static LazyAndThreadSafeSingletonDemo getInstance () {
        return LazyAndThreadSafeSingletonDemoHolder.INSTANCE;
    }
}
