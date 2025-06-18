package com.Madhur.LeetcodeProblems;

import java.util.*;

public class P350 {
    public static void main (String[] args)
    {
        int[] n1={1,2,3,2,1};
        int[] n2={2,2};
        int[] ans=intersect(n1,n2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int l1 = nums1.length;//length of the array 1
        int l2 = nums2.length;//length of the array 2
        Arrays.sort(nums1);//sort
        Arrays.sort(nums2);//sort
        List<Integer> ans = new ArrayList<>(); // we don't know the size of the ans array hence using list
        int bottom = 0, top = 0;// index of the first and the second array
        while (bottom< l1 && top < l2)
        {
            if(nums1[bottom]== nums2[top])
            {
                ans.add(nums1[bottom]);
                bottom++;
                top++;
            }
            else if(nums1[bottom]>nums2[top])
            {
                top++;
            }
            else
            {
                bottom++;
            }
        }
        int[] final_ans=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            final_ans[i]=ans.get(i);
        }
        return final_ans;
    }
}
