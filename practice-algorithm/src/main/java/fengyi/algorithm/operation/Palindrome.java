package fengyi.algorithm.operation;

/**
 * @author fengyi
 * @version 创建时间：2022/6/20 16:55
 * @description: 回文数字
 */
public class Palindrome {

    /**
     * leetcode-9. 回文数
     * @param x 输入数字
     * @return true-是;false-不是
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String inputNum = String.valueOf(x);
        String reverseInputNum = new StringBuilder(inputNum).reverse().toString();

        return inputNum.equals(reverseInputNum);
    }
}
