package fengyi.algorithm.calculate;

/**
 * @author fengyi
 * @version 创建时间：2022/6/20 17:08
 * @description: 爬楼梯
 */
public class ClimbStair {

    /**
     * leetcode-70. 爬楼梯
     * 除 1 和 2 外，其余阶数的结果等于前两阶的结果和
     * @param n 楼梯阶数
     * @return 爬到楼顶的方法
     */
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        // 前两阶的结果
        int beforeFirstResult = 1;
        int beforeSecondResult = 2;

        for (int i = 3; i <= n; i++) {
            int currentResult = beforeFirstResult + beforeSecondResult;

            beforeFirstResult = beforeSecondResult;
            beforeSecondResult = currentResult;
        }

        return beforeSecondResult;
    }
}
