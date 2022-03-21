package com.fengyi.pattern.prototype;

/**
 * @author fengyi
 * @version 创建时间：2022/3/21 11:31
 * @description: 学生
 */
public class Student implements Person {

    /**
     * 名字
     */
    private String name;

    public Student (String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("学生:"+ name + "的工作是学习");
    }

    @Override
    public Person createClone() {
        Person p = null;
        try {
            p = (Person) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
