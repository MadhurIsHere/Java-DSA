package Maths;

public class RightMostSet {
    public static void main(String[] args) {
        int n=8;
        System.out.println(RightMostset(n));
    }
    static int RightMostset(int n)
    {   //basic approach
        //use a loop check weather the mask is giving one not ? if the mask is given 1 thats the ans;
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            int k=((n>>(i-1))&1);
            if(k==1)
            {
                return i;
            }
        }
        return ans;
    }
}
