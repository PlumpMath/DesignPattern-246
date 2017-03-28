package algorithm.sort;

/**
 * @author heyb
 * @date 2017/3/27.
 * @desriptioin
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1, 4};
        int[] sort = new int[arr.length];

        mergeSort(arr, 0, arr.length - 1, sort);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int[] arr, int start, int end, int[] sort) {
        if (end - start <= 0) return;
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid, sort);
        mergeSort(arr, mid + 1, end, sort);
        merge(arr, start, mid, end, sort);
    }

    public static void merge(int[] arr, int start, int mid, int end, int[] sort) {

        int l = start, r = mid + 1;
        int i = 0;

        while (l <= mid && r <= end) {
            if (arr[l] < arr[r])
                sort[i++] = arr[l++];
            else
                sort[i++] = arr[r++];
        }

        while (l <= mid) sort[i++] = arr[l++];
        while (r <= end) sort[i++] = arr[r++];

        for (int j = 0; j < i; j++) {
            arr[start + j] = sort[j];
        }
    }
}
