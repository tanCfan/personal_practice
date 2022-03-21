package com.fengyi.pattern.prototype;

/**
 * @author fengyi
 * @version 创建时间：2022/3/21 11:31
 * @description: 学生
 */
public class Soldier implements Person {

    /**
     * 名称
     */
    private String name;

    public Soldier (String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("士兵:" + name + "的工作是战斗");
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
