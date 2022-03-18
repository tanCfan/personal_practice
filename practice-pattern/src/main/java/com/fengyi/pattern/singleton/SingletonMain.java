package com.fengyi.pattern.singleton;

/**
 * @author fengyi
 * @version 创建时间：2022/3/18 17:37
 * @description: 单例模式测试
 */
public class SingletonMain {

    public static void main(String[] args) {

        System.out.println("=============== 饿汉单例模式 begin ===============");
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        System.out.println("第一次获取到的单例类实例：" + singletonDemo);
        SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
        System.out.println("第二次获取到的单例类实例：" + singletonDemo2);
        System.out.println("=============== 饿汉单例模式 end ===============");

        System.out.println();

        System.out.println("=============== 懒汉非线程安全单例模式 begin ===============");
        LazySingletonDemo lazySingletonDemo = LazySingletonDemo.getInstance();
        System.out.println("第一次获取到的单例类实例：" + lazySingletonDemo);
        LazySingletonDemo lazySingletonDemo2 = LazySingletonDemo.getInstance();
        System.out.println("第二次获取到的单例类实例：" + lazySingletonDemo2);
        System.out.println("=============== 懒汉非线程安全单例模式 end ===============");

        System.out.println();

        System.out.println("=============== 懒汉线程安全单例模式 begin ===============");
        LazyAndThreadSafeSingletonDemo lazyAndThreadSafeSingletonDemo = LazyAndThreadSafeSingletonDemo.getInstance();
        System.out.println("第一次获取到的单例类实例：" + lazyAndThreadSafeSingletonDemo);
        LazyAndThreadSafeSingletonDemo lazyAndThreadSafeSingletonDemo2 = LazyAndThreadSafeSingletonDemo.getInstance();
        System.out.println("第二次获取到的单例类实例：" + lazyAndThreadSafeSingletonDemo2);
        System.out.println("=============== 懒汉线程安全单例模式 end ===============");
    }
}
