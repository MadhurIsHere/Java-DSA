package com.Madhur.LeetcodeProblems;
import java.util.Arrays;
import java.util.*;
public class P448 {
    public static void main (String[] args)
    {
        int[] arr={4,3,2,7,8,2,3,1};
        // cyclic(arr);
        //System.out.println(Arrays.toString(arr));
        List<Integer> ans=solution(arr);
        System.out.println(ans);
    }
    static List<Integer> solution(int[] nums)
    {
        List<Integer> ans=new ArrayList<>();
        int i=0;
        while (i<nums.length)
        {
            int correct=nums[i]-1;
            if (nums[correct]!=nums[i])
            {
                swap(nums,correct,i);
            }
            else
            {
                i++;
            }
        }
        for (int k=0;k<nums.length;k++)
        {
            if (k+1!=nums[k])
                ans.add(k+1);
        }
        return ans;
    }
    // experiment like what happens with duplicate values
    static void cyclic(int[] nums)
    {
        int i=0;
        while (i<nums.length)
        {
            int correct=nums[i]-1;
            if (nums[correct]!=nums[i])
            {
                swap(nums,correct,i);
            }
            else
            {
                i++;
            }
        }
    }
    static void swap(int[] arr,int a,int b)
    {
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
}
