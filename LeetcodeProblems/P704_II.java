package com.Madhur.LeetcodeProblems;

public class P704_II {
    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(a, 2));
    }
    static int search(int[] nums, int target)
    {
        int start=0;
        int end=nums.length-1;
        return recur(nums,target,start,end);
    }
    static int recur(int[] nums, int target, int start, int end) {
        if (start <= end) {
            int mid=start+(end-start)/2;
            if (target == nums[mid])
                return mid;
            if (target > nums[mid])
                return recur(nums, target,mid+1, end);
            else if (target < nums[mid])
                return recur(nums, target, start, mid - 1);
        }
        return -1;
    }
}
