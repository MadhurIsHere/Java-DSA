import java.util.*;
public class P1863
{
    public static void main (String[] args)
    {
        int[] a={1,3};
        System.out.println(subsetXORSum(a));
    }
    static public int subsetXORSum(int[] nums)
    {
        List<List<Integer>> totalSum=new ArrayList<>(); //2d list
        int sum=0;
        int n=1<<nums.length;                           //2^n
        for(int mask=0;mask<n;mask++)
        {
            List<Integer> subset=new ArrayList<>();     //1d list
            int xor=0;
            for (int j=0;j<nums.length;j++)
            {
                subset.add(nums[j]);
                xor^=nums[j];
            }
        if(subset[0]!="")
            {
                sum+=xor;
            }
        }
        return sum;
    }
}