package fengyi.algorithm.calculate;

/**
 * @author fengyi
 * @version 创建时间：2022/6/17 14:14
 * @description: 求和
 */
public class Sum {

    /**
     * 在输入的数组中获取两个元素，这两个元素的和等于输入target
     * @param nums 输入数组
     * @param target 目标和
     * @return 和等于输入target的元素下标数组
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
