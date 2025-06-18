package com.Madhur.LeetcodeProblems;

public class P41 {
    public static void main(String[] args) {
        int[] a = {1, -1, 3, 4};
        int b = firstMissingPositive(a);
        System.out.println(b);
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && correct < nums.length && nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {

            if (nums[k] != k + 1)
                return k + 1;
        }
        return nums.length + 1;
    }

    static void swap(int[] a, int x, int y) {
        a[x] = a[x] + a[y];
        a[y] = a[x] - a[y];
        a[x] = a[x] - a[y];
    }
}
