package com.fengyi.pattern.iterator;

/**
 * @author fengyi
 * @version 创建时间：2022/3/16 11:19
 * @description: 鱼塘
 */
public class FishPond implements Aggregate {

    /**
     * 鱼
     */
    private Fish[] fishArray;

    private int last;

    @Override
    public Iterator iterator() {
        return new FishPondIterator(this);
    }

    public FishPond(int size) {
        fishArray = new Fish[size];
    }

    public boolean addFish(Fish fish) {
        if (last == fishArray.length) {
            return false;
        }

        fishArray[last] = fish;
        last++;
        return true;
    }

    public int getSize() {
        return last;
    }

    public Fish getFish(int i) {
        if (i > last || i < 0) {
            return null;
        }
        return fishArray[i];
    }
}
