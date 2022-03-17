package com.fengyi.pattern.template;

/**
 * @author fengyi
 * @version 创建时间：2022/3/17 14:34
 * @description: 模板方法测试
 */
public class TemplateMain {

    public static void main(String[] args) {
        System.out.println("=============== 模板方法 begin ===============");

        Fridge ordinaryFridge = new OrdinaryFridge();
        Fridge smartFridge = new SmartFridge();

        ordinaryFridge.storage();
        System.out.println();
        smartFridge.storage();

        System.out.println("=============== 模板方法 end ===============");
    }
}
