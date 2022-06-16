package fengyi.algorithm.search;

/**
 * @author fengyi
 * @version 创建时间：2022/6/16 9:33
 * @description: 查找最长公共前缀
 */
public class LongestCommonPrefix {


    /**
     * 1. 获取取数组中第一个字符串作为初始最大公共前缀
     * 2. 获取 最大公共前缀 与 后续字符串 的最大公共前缀
     * 3. 重复第2步操作
     * @param inputStrArr 输入字符串数组
     * @return 数组中所有字符串间的最大公共前缀
     */
    public static String searchLongestCommonPrefix(String[] inputStrArr) {
        if (inputStrArr == null || inputStrArr.length == 0) {
            return "";
        }

        if (inputStrArr.length == 1) {
            return inputStrArr[0];
        }

        // 获取取数组中第一个字符串作为初始最大公共前缀
        String result = inputStrArr[0];

        for (int index = 1; index < inputStrArr.length; index++) {
            // 获取 最大公共前缀 与 后续字符串 的最大公共前缀
            while (inputStrArr[index].indexOf(result) != 0) {
                // 最大公共前缀短一位
                result = result.substring(0, result.length() - 1);
            }

            // 两个字符串间没有公共前缀则无需再进行后续比较
            if ("".equals(result)) {
                return result;
            }
        }

        return result;
    }
}
