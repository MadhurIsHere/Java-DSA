package com.Madhur.Sortings;
//selection sorting
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 2, 3};
        selection(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getmax(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }
    public static void swap(int[] a,int start,int end)
    {
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }
    public static int getmax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}

