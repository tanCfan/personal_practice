package fengyi.algorithm.operation;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyi
 * @version 创建时间：2022/6/20 17:42
 * @description: 测试括号
 */
public class BracketsTest {

    @Test
    public void testIsValidBrackets() {
        String inputStr = "([)]";
        boolean expectResult = false;

        boolean result = Brackets.isValidBrackets(inputStr);
        Assert.assertEquals(expectResult, result);
    }
}
