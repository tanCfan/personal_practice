package fengyi.algorithm.operation;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyi
 * @version 创建时间：2022/6/17 15:13
 * @description: 重新排列字符串中的空格
 */
public class ReorderSpaceTest {

    @Test
    public void testReorderSpaces() {
//        String inputStr = "  this   is  a sentence ";
//        String expectResult = "this   is   a   sentence";

        String inputStr = "a";
        String expectResult = "a";

        // 对字符串中的空格进行重新排列
        String result = ReorderSpace.reorderSpaces(inputStr);

        Assert.assertEquals(expectResult, result);
    }
}
