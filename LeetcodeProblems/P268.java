package com.LeetcodeProblems;

//Missing number
public class P268 {
    public static void main(String[] args) {
        int[] a = {0, 2,4,7,8,1,5,6};
        System.out.println(cyclic(a));
    }

    static int cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (correct < arr.length && arr[correct] != arr[i]) {
                swap(arr, i, correct);

            } else {
                i++;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            if (k != arr[k])
                return k;
        }

        return arr.length;
    }

    static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
}
