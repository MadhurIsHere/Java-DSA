package Maths;

public class MagicNumber {
    public static void main(String[] args)
    {
        int n=4;
        int ans=magicnumber(n);
        System.out.println(ans);
    }
    static int magicnumber(int n)
    {
        int ans=0;
        int k=1;
        while(n>0)
        {
            int lsb=n&1;
            ans+= (int) (lsb*Math.pow(5,k));
            n=n>>1;
            k++;
        }
        return ans;
    }
}
