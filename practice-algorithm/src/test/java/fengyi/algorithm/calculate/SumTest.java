package fengyi.algorithm.calculate;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fengyi
 * @version 创建时间：2022/6/17 14:18
 * @description: 测试求和
 */
public class SumTest {

    @Test
    public void testTwoSum() {
//        int[] inputArr = new int[] {2,7,11,15};
//        int target = 9;
//        int[] expectResult = new int[]{0, 1};

        int[] inputArr = new int[] {3,2,4};
        int target = 6;
        int[] expectResult = new int[]{1,2};

        // 获取和等于目标和的两个元素下标
        int[] result = Sum.twoSum(inputArr, target);

        Assert.assertNotNull(result);
        Assert.assertEquals(expectResult.length, result.length);
        for (int i = 0; i < expectResult.length; i++) {
            Assert.assertEquals(expectResult[i], result[i]);
        }
    }

    @Test
    public void testAddTwoNumbers() {
        // 拼凑加数1
        ListNode inputAddNumRoot1 = new ListNode();
        ListNode cursorNode1 = inputAddNumRoot1;
        int[] inputAddNumArr1 = new int[] {2,4,3};
        for (int j : inputAddNumArr1) {
            cursorNode1.next = new ListNode(j);
            cursorNode1 = cursorNode1.next;
        }

        // 拼凑加数2
        ListNode inputAddNumRoot2 = new ListNode();
        ListNode cursorNode2 = inputAddNumRoot2;
        int[] inputAddNumArr2 = new int[] {5,6,4};
        for (int j : inputAddNumArr2) {
            cursorNode2.next = new ListNode(j);
            cursorNode2 = cursorNode2.next;
        }

        // 拼凑期望结果
        ListNode expectResultRoot = new ListNode();
        ListNode cursorResult = expectResultRoot;
        int[] resultArr = new int[]{7,0,8};
        for (int j : resultArr) {
            cursorResult.next = new ListNode(j);
            cursorResult = cursorResult.next;
        }

        // 校验返回结果
        ListNode resultNode = Sum.addTwoNumbers(inputAddNumRoot1.next, inputAddNumRoot2.next);
        while (expectResultRoot.next != null) {
            Assert.assertEquals(expectResultRoot.next.val, resultNode.val);
            expectResultRoot = expectResultRoot.next;
            resultNode = resultNode.next;
        }
    }
}
