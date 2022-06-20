package fengyi.algorithm.calculate;


/**
 * @author fengyi
 * @version 创建时间：2022/6/17 14:14
 * @description: 求和
 */
public class Sum {

    /**
     * leetcode-1. 两数之和
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

    /**
     * leetcode-2. 两数相加（注意ListNode表示的数字是逆序排列）
     * @param l1 加数1
     * @param l2 加数2
     * @return 两数之和
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rootNode = new ListNode();
        ListNode cursorNode = rootNode;

        // 当前位置两个数字和产生进位
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int addNum1 = l1 != null ? l1.val : 0;
            int addNum2 = l2 != null ? l2.val : 0;

            int sum = addNum1 + addNum2 + carry;
            carry = sum / 10;

            cursorNode.next = new ListNode(sum % 10);
            cursorNode = cursorNode.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        return rootNode.next;
    }
}
