package fengyi.algorithm.operation;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyi
 * @version 创建时间：2022/4/27 10:36
 * @description: 排序测试类
 */
public class BackToMainDirTest {


    @Test
    public void testMinOperations() {
        String[] inputStrArr = new String[]{"d1/","d2/","../","d21/","./"};
        int expectCount = 2;

        // 回到主文件夹的
        int result = BackToMainDir.minOperations(inputStrArr);

        Assert.assertEquals(2, result);
    }
}
