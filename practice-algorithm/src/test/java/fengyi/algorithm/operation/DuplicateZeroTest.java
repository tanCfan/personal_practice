package fengyi.algorithm.operation;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyi
 * @version 创建时间：2022/6/17 13:59
 * @description: 测试复写零
 */
public class DuplicateZeroTest {

    @Test
    public void testDuplicateZeros() {
        int[] inputArr = new int[]{1, 2, 3};
        int[] expectResult = new int[]{1, 2, 3};
//        int[] inputArr = new int[]{1,0,2,3,0,4,5,0};
//        int[] expectResult = new int[]{1,0,0,2,3,0,0,4};

        // 对数组中的零元素进行复写操作
        int[] result = DuplicateZero.duplicateZeros(inputArr);


        Assert.assertNotNull(result);
        Assert.assertEquals(result.length, expectResult.length);

        for (int i = 0; i < expectResult.length; i++) {
            Assert.assertEquals(expectResult[i], result[i]);
        }
    }
}
