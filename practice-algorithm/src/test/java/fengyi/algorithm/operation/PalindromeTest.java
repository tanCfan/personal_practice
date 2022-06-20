package fengyi.algorithm.operation;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyi
 * @version 创建时间：2022/6/20 16:58
 * @description: 测试回文数
 */
public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        int inputNum = 121;
        boolean expectResult = true;
        boolean result = Palindrome.isPalindrome(inputNum);

        Assert.assertEquals(expectResult, result);
    }
}
