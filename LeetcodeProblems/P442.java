package com.Madhur.LeetcodeProblems;
import java.util.*;
public class P442 {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> ans=solution(arr);
        System.out.println(ans);
    }
    public static List<Integer> solution(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if (nums[correct]!=nums[i])
                swap(nums,i,correct);
            else i++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {
            if(j+1!=nums[j])
                ans.add(nums[j]);
        }
        return ans;
    }
    static void swap(int[] arr,int a, int b)
    {
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
}
