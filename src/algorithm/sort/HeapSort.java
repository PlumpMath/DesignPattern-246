package algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author heyb
 * @date 2017/3/28.
 * @desriptioin
 */
public class HeapSort {

    private static void shift(int[] src, int pos, int len) {
        int sonIdx = pos * 2;

        while (pos < len / 2) {//前半段区域是pos的有效区域，当pos > len/2,sonIdx > len,超出了
            if (src[sonIdx] < src[sonIdx + 1]) sonIdx++;

            if (src[pos] < src[sonIdx]) {//调整为father node 比son element 大

                int temp = src[pos];
                src[pos] = src[sonIdx];
                src[sonIdx] = temp;

                pos = sonIdx;
                sonIdx = pos * 2;
            } else
                break;
        }
    }

    public static void heapSort(int[] src) {

        for (int i = src.length / 2; i >= 1; i--) {//调整为大顶堆
            shift(src, i, src.length);
        }

        //交换堆顶元素和最后一个元素，再调整堆顶元素，使之有序
        for (int i = src.length - 1; i >= 2; i--) {
            int temp = src[i];
            src[i] = src[1];
            src[1] = temp;

            shift(src, 1, i);
        }
    }

    @Test
    public void test() {
        int[] a = new int[]{0, 6, 7, 9, 3, 1, 2, 8, 7};
        shift(a, 1, a.length);
        Assert.assertArrayEquals(new int[]{0, 9, 7, 8, 3, 1, 2, 6, 7}, a);

        heapSort(a);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 6, 7, 7, 8, 9}, a);

        final int MAX = 1000000;
        int[] arr = new int[MAX];
        for (int i = 1; i < MAX; i++) {
            arr[i] = MAX - i;
        }

//         top key
        int[] rs = topKey(arr, 10);
//
        Assert.assertArrayEquals(new int[]{999990, 999991, 999992, 999993, 999994, 999995, 999996, 999997, 999998, 999999}, rs);
        heapSort(arr);
        Assert.assertEquals(MAX - 1, arr[MAX - 1]);

    }

    private int[] topKey(int[] arr, int i) {
        int len = arr.length;
        int[] rs = new int[Math.min(i, len)];
        for (int j = len / 2; j >= 1; j--) {
            shift(arr, j, len);
        }
        for (int j = len - 1; j >= len - 1 - i; j--) {
            int temp = arr[j];
            arr[j] = arr[1];
            arr[1] = temp;

            shift(arr, 1, j);
        }

        System.arraycopy(arr, len  - i, rs, 0, i);
        return rs;
    }
}
