package com.fengyi.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengyi
 * @version 创建时间：2022/3/21 11:36
 * @description: 上帝
 */
public class God {
    private Map<String, Person> personCategoryMap = new HashMap<>(4);

    public void addPersonCategory(String personCategory, Person p) {
        personCategoryMap.put(personCategory, p);
    }

    public Person clonePerson(String personCategory) {
        Person person = personCategoryMap.get(personCategory);
        return person.createClone();
    }
}
