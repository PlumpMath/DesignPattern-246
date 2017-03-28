package algorithm.sort;

/**
 * @author heyb
 * @date 2017/3/27.
 * @desriptioin
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 9, 7, 6, 55, 2};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        int l = start;
        int h = end;
        if (l >= h) return;
        int pivot = arr[start];

        while (l < h) {
            while (l < h && pivot < arr[h]) h--;
            if (l < h) arr[l] = arr[h];

            while (l < h && pivot > arr[l]) l++;
            if (l < h) arr[h] = arr[l];
        }
        arr[h] = pivot;

        quickSort(arr, start, h - 1);
        quickSort(arr, h + 1, end);
    }
}
