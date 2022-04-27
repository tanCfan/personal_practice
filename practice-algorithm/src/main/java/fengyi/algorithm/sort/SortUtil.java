package fengyi.algorithm.sort;

/**
 * @author fengyi
 * @version 创建时间：2022/4/27 10:28
 * @description: 排序工具类
 */
public class SortUtil {

    /**
     * 冒泡升序排序
     * 1. 逐一比较相邻两个数的大小，如果当前位置比后一位置元素大则交换位置
     * 2. N 个元素需要循环 N - 1 次才能确定所有位置元素
     * 3. （array.length-1 - i） 上一轮次循环已经确定位置的元素无需再在本次循环中再次参与比较
     *
     * @param array 待排序数组
     */
    public static void bubbleSortAsc(int[] array) {
        if (array == null || array.length <= 0) {
            return;
        }

        //  N 个元素需要循环 N - 1 次才能确定所有位置元素
        for (int i = 0; i < array.length - 1; i++) {
            // 上一轮次循环已经确定位置的元素无需再在本次循环中再次参与比较
            for (int j = 0; j < array.length - 1 - i; j++) {
                // 逐一比较相邻两个数的大小，如果当前位置比后一位置元素大则交换位置
                if (array[j] > array[j + 1]) {
                    int tem = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tem;
                }
            }
        }
    }

    /**
     * 快速升序排序
     *
     * @param array 待排序数组
     */
    public static void quickSortAsc(int[] array) {
        if (array == null || array.length <= 0) {
            return;
        }

        // 快速升序排序
        quickSortAsc(array, 0, array.length - 1);
    }

    /**
     * 快速升序排序实现
     * 1. 获取待排序数组基准数，基准数左侧元素均小于基准数，基准数右侧元素均大于基准数
     * 2. 将基准数左侧区间及基准数右侧区间作为新的待排序数组，执行第一步操作
     * 3. 递归以上两个步骤
     * @param array 待排序数组
     * @param begin 起始位置
     * @param end 结束位置
     */
    private static void quickSortAsc(int[] array, int begin, int end){
        if (array == null || array.length <= 0) {
            return;
        }

        if (begin > end) {
            return;
        }

        if (end >= array.length) {
            return;
        }

        int left = begin;
        int right = end;
        int basic = array[begin];

        while (left != right) {

            // 一直往左查找，直到获取到小于等于基准数的元素
            while (array[right] >= basic && right > left) {
                right--;
            }

            // 一直往右查找，直到获取到大于等于基准数的元素
            while (array[left] <= basic && left < right) {
                left++;
            }

            // left 依旧位于 right 左侧 则交换元素
            if (right > left) {
                int tem = array[right];
                array[right] = array[left];
                array[left] = tem;
            }
        }

        // 将 基准元素 与 基准水位上的元素 交换
        array[begin] = array[left];
        array[left] = basic;

        // 递归处理左右两侧区间
        quickSortAsc(array, begin, left-1);
        quickSortAsc(array, left+1, end);
    }
}
