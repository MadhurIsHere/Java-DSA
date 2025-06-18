package LeetcodeProblems;

public class P69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(36));
    }
    public static int mySqrt(int x) {
        if(x==0 || x==1)
            return 0;
        int start=0;
        int end =x;
        int ans=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid*mid<=x)
            {
                start=mid+1;
                ans=mid;
            }
            else
                end=mid-1;
        }
        return ans;
    }
}
