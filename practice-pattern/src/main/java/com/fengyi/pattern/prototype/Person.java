package com.fengyi.pattern.prototype;

/**
 * @author fengyi
 * @version 创建时间：2022/3/21 11:28
 * @description: 人
 */
public interface Person extends Cloneable {

    /**
     * 工作
     */
    void work();

    /**
     * 创建克隆人
     * @return 克隆人
     */
    Person createClone();
}
