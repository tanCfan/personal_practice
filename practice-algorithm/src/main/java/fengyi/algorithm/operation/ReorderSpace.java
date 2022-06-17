package fengyi.algorithm.operation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengyi
 * @version 创建时间：2022/6/17 14:35
 * @description: 重新排列空格
 */
public class ReorderSpace {

    /**
     * leetcode-1592. 重新排列单词间的空格
     * 输入一个字符串 text
     * 该字符串由若干被空格包围的单词组成
     * 每个单词由一个或者多个小写英文字母组成
     * 并且两个单词之间至少存在一个空格
     * text 至少包含一个单词
     *
     * @param text 输入字符串
     * @return 重新排列空格后的字符串
     */
    public static String reorderSpaces(String text) {
        if (text == null || "".equals(text)) {
            return text;
        }

        // 获取输入内容总空格数 及所有单词
        int spaceCount = 0;
        List<String> words = new ArrayList<>();
        char singleSpace = ' ';
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length;) {
            if (chars[i] == singleSpace) {
                spaceCount++;
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                while (i < chars.length && chars[i] != singleSpace) {
                    sb.append(chars[i]);
                    i++;
                }
                words.add(sb.toString());
            }
        }

        // 计算单词间需要填充的空格数
        int wordsCount = words.size();
        int spaceBetweenWords = wordsCount == 1 ? spaceCount : spaceCount / (wordsCount - 1);
        String spaceBetweenWordsStr = "";
        if (spaceBetweenWords > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < spaceBetweenWords; i++) {
                sb.append(" ");
            }
            spaceBetweenWordsStr = sb.toString();
        }

        // 计算需要在末尾填充的空格数
        String lastFixSpaces = "";
        int lastFixSpaceCount = spaceCount - ((wordsCount - 1) * spaceBetweenWords);
        if (lastFixSpaceCount > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lastFixSpaceCount; i++) {
                sb.append(" ");
            }
            lastFixSpaces = sb.toString();
        }

        // 单词间填充空格
        StringBuilder resultSb = new StringBuilder();
        for (String word : words) {
            resultSb.append(word).append(spaceBetweenWordsStr);
        }

        // 删除末尾多添加的空格
        int index = resultSb.lastIndexOf(spaceBetweenWordsStr);
        resultSb.delete(index, resultSb.length());

        // 末尾填充空格
        if (!"".equals(lastFixSpaces)) {
            resultSb.append(lastFixSpaces);
        }

        return resultSb.toString();
    }
}
