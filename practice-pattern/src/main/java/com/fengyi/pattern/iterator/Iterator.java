package com.fengyi.pattern.iterator;

/**
 * @author fengyi
 * @version 创建时间：2022/3/16 11:13
 * @description: 迭代器顶级接口
 */
public interface Iterator {

    /**
     * 是否还存在下一个元素
     * @return true-是;false-不是
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     * @return 下一个元素
     */
    Fish next();
}
