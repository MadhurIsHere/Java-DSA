package com.Madhur.LeetcodeProblems;
import java.util.*;
public class P645 {
    public static void main(String[] args)
    {
        int[] a={2,6,1,4,3,3};
        int[] ans=findErrorNums(a);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if (nums[correct]!=nums[i])
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }
        for (int k=0;k<nums.length;k++)
        {
            if (nums[k]!=k+1)
            {
                ans[0] = nums[k];
                ans[1] = k+1;
            }
        }
        return ans;
    }

    private static void swap(int[] a, int x, int y)
    {
        a[x]=a[x]+a[y];
        a[y]=a[x]-a[y];
        a[x]=a[x]-a[y];
    }

}
