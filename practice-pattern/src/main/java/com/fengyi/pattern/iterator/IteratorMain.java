package com.fengyi.pattern.iterator;

/**
 * @author fengyi
 * @version 创建时间：2022/3/16 14:41
 * @description: 迭代器测试
 */
public class IteratorMain {

    public static void main(String[] args) {
        FishPond fishPond = new FishPond(5);
        fishPond.addFish(new Fish("罗非鱼"));
        fishPond.addFish(new Fish("草鱼"));
        fishPond.addFish(new Fish("金枪鱼"));
        fishPond.addFish(new Fish("鲨鱼"));

        System.out.println("=============== 迭代器模式 begin ===============");
        Iterator iterator = fishPond.iterator();
        while (iterator.hasNext()) {
            Fish next = iterator.next();
            System.out.println(next.getType());
        }
        System.out.println("=============== 迭代器模式 end ===============");
    }
}
