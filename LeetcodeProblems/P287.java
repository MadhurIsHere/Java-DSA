package com.Madhur.LeetcodeProblems;

public class P287 {
    public static void main(String[] args)
    {
        int[] a={3,4,2,1,4,5};
        System.out.println(findDuplicate(a));
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if (nums[i]!=i+1) {
                int correct = nums[i] - 1;
                if (nums[correct] != nums[i]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else i++;
        }
        return -1;
    }
    static void swap(int[] a,int x,int y)
    {
        a[x]=a[x]+a[y];
        a[y]=a[x]-a[y];
        a[x]=a[x]-a[y];
    }
}
