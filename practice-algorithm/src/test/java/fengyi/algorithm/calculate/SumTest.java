package fengyi.algorithm.calculate;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyi
 * @version 创建时间：2022/6/17 14:18
 * @description: 测试求和
 */
public class SumTest {

    @Test
    public void testTwoSum() {
//        int[] inputArr = new int[] {2,7,11,15};
//        int target = 9;
//        int[] expectResult = new int[]{0, 1};

        int[] inputArr = new int[] {3,2,4};
        int target = 6;
        int[] expectResult = new int[]{1,2};

        // 获取和等于目标和的两个元素下标
        int[] result = Sum.twoSum(inputArr, target);

        Assert.assertNotNull(result);
        Assert.assertEquals(result.length, expectResult.length);
        for (int i = 0; i < expectResult.length; i++) {
            Assert.assertEquals(expectResult[i], result[i]);
        }
    }
}
