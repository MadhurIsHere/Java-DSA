package LeetcodeProblems;

import java.util.Arrays;

public class P189 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int k=3;
        rotate(a,k);
        System.out.println(Arrays.toString(a));
    }
    public static void rotate(int[] nums, int k) {
        k%=nums.length; // to handel if the number k> length of the array
        reversed(nums,0,nums.length-1); // whole array
        reversed(nums,0,k-1);           // first reversed the k elements
        reversed(nums,k,nums.length-1);       // remaining elements
    }
    public static void reversed(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
