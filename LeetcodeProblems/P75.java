package LeetcodeProblems;
import java.util.*;
public class P75 {
    public static void main(String[] args) {
        int a[]={2,0,1};
        sortColors(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]==0)
            {
                red++;
            }
            else if(nums[i]==1)
            {
                white++;
            }
            else
            {
                blue++;
            }
        }
        Arrays.fill(nums,0,red,0);
        Arrays.fill(nums,red,red+white,1);
        Arrays.fill(nums,red+white,nums.length,2);
    }
}
