package com.fengyi.pattern.prototype;

/**
 * @author fengyi
 * @version 创建时间：2022/3/21 11:42
 * @description: 原型模式测试
 */
public class PrototypeMain {

    public static void main(String[] args) {
        System.out.println("=============== 原型模式 begin ===============");
        God god = new God();
        Person student = new Student("张三");
        Person soldier = new Soldier("李四");

        god.addPersonCategory("student", student);
        god.addPersonCategory("soldier", soldier);

        Person student1 = god.clonePerson("student");
        student1.work();

        Person soldier1 = god.clonePerson("soldier");
        soldier1.work();

        System.out.println("=============== 原型模式 end ===============");
    }
}
