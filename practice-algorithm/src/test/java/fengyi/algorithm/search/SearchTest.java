package fengyi.algorithm.search;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyi
 * @version 创建时间：2022/4/27 10:36
 * @description: 排序测试类
 */
public class SearchTest {


    @Test
    public void testBubbleSortAsc() {
        String[] strings = new String[]{"flower","aaa","flight"};
        String result = LongestCommonPrefix.searchLongestCommonPrefix(strings);
        Assert.assertEquals("", result);
    }
}
