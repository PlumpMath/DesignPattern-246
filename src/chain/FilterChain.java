package chain;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by heyb on 2017/3/17.
 */
public class FilterChain implements IChain {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 53, 2, 2, 3, 1};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        Integer b = 1;
        setInt(b);
        System.out.println(b);

        Child p = new Child();
        test();
    }

    public static void setInt(Integer i) {
        i = 100;
    }

    public static void quickSort(int[] arr, int start, int end) {
        int l = start, h = end;
        int pivot = arr[l];

        if (l >= h) return;
        while (l < h) {

            while (l < h && pivot < arr[h]) h--;
            if (l < h) {
//                int temp = arr[l];
                arr[l] = arr[h];
//                arr[h] = temp;
                l++;
            }

            while (l < h && pivot > arr[l]) l++;
            if (l < h) {
//                int temp = arr[l];
                arr[h] = arr[l];
//                arr[h] = temp;
                h--;
            }
        }
        arr[h] = pivot;

        quickSort(arr, start, h - 1);
        quickSort(arr, h + 1, end);
    }

    public static void test() {
        try {
            throw new IOException();
        } catch (FileNotFoundException e) {
            System.out.println(1);
        } catch (IOException e) {
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);
        }
    }
}

class Child extends Person {
    static {
        System.out.println("static Child");
    }

    public Child() {
        System.out.println("constructor Child");
    }
}

class Person {
    static {
        System.out.println("person static");
    }

    public Person() {
        System.out.println("constructor person");
    }
}
