package LeetcodeProblems;
import java.util.*;

public class P167 {
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(a,9)));
    }
    public static int[] twoSum(int[] numbers, int target) {

        int start =0;
        int end=numbers.length-1;
        while(start<end)
        {
            int sum=numbers[start]+numbers[end];
            if(sum==target)
                return new int[] {start+1,end+1};
            if(sum>target)
            {
                end--;
            }
            else
                start++;
        }

        return new int[]{-1,-1};
    }
}
