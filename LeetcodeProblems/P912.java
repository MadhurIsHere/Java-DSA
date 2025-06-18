package com.Madhur.LeetcodeProblems;
import java.util.*;
public class P912 {
    public static void main(String[] args) {
        int[] a={1,4,2,4,5,7,4};
        System.out.println(Arrays.toString(sortArray(a)));
    }
    public static int[] sortArray(int[] nums) {
        boolean flag;
        for(int i=0;i<nums.length-1;i++)
        {
            flag=false;
            for(int j=1;j<nums.length-i;j++)
            {
                if(nums[j]<nums[j-1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    flag=true;
                }
            }
            if(!flag)
                break;
        }
        return nums;
    }
}
