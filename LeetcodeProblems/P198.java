package LeetcodeProblems;

public class P198 {
    public static void main(String[] args)
    {
        int[] a={1,2,3,1};
        System.out.println(rob(a));
    }
    public static int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        int a=0,b=0;
        for(int elem: nums)
        {
            int temp=a;
            a=Math.max(a,b+elem);
            b=temp;
        }
        return a;
    }
}
