package fengyi.algorithm.operation;

/**
 * @author fengyi
 * @version 创建时间：2022/6/17 13:53
 * @description: 复写零
 */
public class DuplicateZero {

    /**
     * 对输入的数组进行零复写操作（某个位置上若出现了0，则复写该元素，其余元素往后挪，数组长度不变）
     * 输入：[1,0,2,3,0,4,5,0]
     * 输出：[1,0,0,2,3,0,0,4]
     * @param arr 输入数组
     * @return 零复写后的数组
     */
    public static int[] duplicateZeros(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current == 0) {
                // 当前元素是0，其后所有元素都往后挪
                for (int j = arr.length-1; j > i; j--) {
                    arr[j] = arr[j-1];
                }

                // 跳过插入的0元素
                i++;
            }
        }

        return arr;
    }
}
