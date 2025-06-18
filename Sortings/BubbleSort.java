package com.Madhur.Sortings;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 2, 3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] arr) {
        boolean k = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];
                    k = true;
                }
            }
            if (!k) {
                break;
            }
        }
    }
}
