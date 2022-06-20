package fengyi.algorithm.calculate;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyi
 * @version 创建时间：2022/6/20 17:08
 * @description: 爬楼梯
 */
public class ClimbStairTest {

    @Test
    public void testClimbStairs() {

        int input = 3;
        int expectResult = 3;

        int result = ClimbStair.climbStairs(input);
        Assert.assertEquals(expectResult, result);
    }
}
