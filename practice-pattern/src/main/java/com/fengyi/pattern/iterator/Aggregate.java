package com.fengyi.pattern.iterator;

/**
 * @author fengyi
 * @version 创建时间：2022/3/16 11:13
 * @description: 聚合接口
 */
public interface Aggregate {
    /**
     * 获取迭代器
     * @return 迭代器
     */
    Iterator iterator();
}
