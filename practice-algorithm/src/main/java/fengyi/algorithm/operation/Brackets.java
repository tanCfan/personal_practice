package fengyi.algorithm.operation;

import java.util.Stack;

/**
 * @author fengyi
 * @version 创建时间：2022/6/20 17:34
 * @description: 有效括号
 */
public class Brackets {


    /**
     * leetcode-20. 有效的括号
     * @param s 输入字符串
     * @return true-有效;false-无效
     */
    public static boolean isValidBrackets(String s) {
        if (s == null || s.length() < 1) {
            return false;
        }

        // 数据栈
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if ('(' == aChar) {
                stack.push(')');
            } else if ('{' == aChar) {
                stack.push('}');
            } else if ('[' == aChar) {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != aChar) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
