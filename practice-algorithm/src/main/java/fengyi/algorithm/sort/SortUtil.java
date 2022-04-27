package fengyi.algorithm.sort;

/**
 * @author fengyi
 * @version 创建时间：2022/4/27 10:28
 * @description: 排序工具类
 */
public class SortUtil {

    /**
     * 冒泡排序
     * 1. 逐一比较相邻两个数的大小，如果当前位置比后一位置元素大则交换位置
     * 2. N 个元素需要循环 N - 1 次才能确定所有位置元素
     * 3. （array.length-1 - i） 上一轮次循环已经确定位置的元素无需再在本次循环中再次参与比较
     * @param array 数组
     */
    public static void bubbleSortAsc(int[] array) {
        if (array == null || array.length <= 0) {
            return;
        }

        //  N 个元素需要循环 N - 1 次才能确定所有位置元素
        for (int i = 0; i < array.length -1 ; i++) {
            // 上一轮次循环已经确定位置的元素无需再在本次循环中再次参与比较
            for (int j = 0; j < array.length-1 - i; j++){
                // 逐一比较相邻两个数的大小，如果当前位置比后一位置元素大则交换位置
                if (array[j] > array[j+1]) {
                    int tem = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tem;
                }
            }
        }
    }
}
