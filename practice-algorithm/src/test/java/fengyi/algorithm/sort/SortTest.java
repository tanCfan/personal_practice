package fengyi.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyi
 * @version 创建时间：2022/4/27 10:36
 * @description: 排序测试类
 */
public class SortTest {


    @Test
    public void testBubbleSortAsc() {
        int [] array = new int[] {32, 45, 11, 9, 64, 51};
        SortUtil.bubbleSortAsc(array);
        for (int i = 0; i < array.length-1; i++) {
            Assert.assertTrue(array[i] <= array[i+1]);
        }
    }
}
