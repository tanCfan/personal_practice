package fengyi.algorithm.operation;

import java.util.Stack;

/**
 * @author fengyi
 * @version 创建时间：2022/6/17 15:58
 * @description: 最少步数回到主文件夹
 */
public class BackToMainDir {

    /**
     * 停留在当前文件夹
     */
    private static final String STAY_CURRENT = "./";

    /**
     * 移动到父文件夹
     */
    private static final String MOVE_TO_PARENT = "../";

    /**
     * leetcode-1598. 文件夹操作日志搜集器
     * @param logs 输入字符串数组
     * @return 最小步数
     */
    public static int minOperations(String[] logs) {
        if (logs == null || logs.length == 0) {
            return 0;
        }

        // 步骤栈
        Stack<String> stepStack = new Stack<>();

        for (String log : logs) {
            if (MOVE_TO_PARENT.equals(log)) {
                if (stepStack.size() > 0) {
                    stepStack.pop();
                }
            } else if (!STAY_CURRENT.equals(log)) {
                stepStack.push(log);
            }
        }

        return stepStack.size();
    }
}
