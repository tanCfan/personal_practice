package com.fengyi.pattern.iterator;

/**
 * @author fengyi
 * @version 创建时间：2022/3/16 11:17
 * @description: 鱼塘迭代器
 */
public class FishPondIterator implements Iterator{

    /**
     * 鱼塘
     */
    private FishPond fishPond;

    /**
     * 当前下标
     */
    private int index;

    public FishPondIterator (FishPond fishPond) {
        this.fishPond = fishPond;
    }

    @Override
    public boolean hasNext() {
        return index < fishPond.getSize();
    }

    @Override
    public Fish next() {
        Fish fish = fishPond.getFish(index);
        index++;
        return fish;
    }
}
