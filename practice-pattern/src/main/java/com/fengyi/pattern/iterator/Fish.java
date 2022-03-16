package com.fengyi.pattern.iterator;

/**
 * @author fengyi
 * @version 创建时间：2022/3/16 11:24
 * @description: 鱼
 */
public class Fish {

    /**
     * 草鱼 罗非鱼
     */
    private String type;

    public Fish (String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
