package LeetcodeProblems;

import java.util.Arrays;

public class P912II {
    public int[] sortArray(int[] nums) {
        if(nums.length==1)
            return nums;

        int mid=nums.length/2;
        int[] left=sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] right=sortArray(Arrays.copyOfRange(nums,mid,nums.length));
        return sort(left,right);
    }
    static int[] sort(int[] first,int[] second)
    {
        int[] sorted=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                sorted[k]=first[i];
                i++;
            }
            else
            {
                sorted[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length)
        {
            sorted[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length)
        {
            sorted[k]=second[j];
            j++;
            k++;
        }
        return sorted;
    }
}
