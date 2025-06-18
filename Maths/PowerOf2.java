package Maths;

public class PowerOf2 {
    public static void main(String[] args)
    {
        //right shift is a>>b= a/2^b
        // to find this we could do n&(n-1)=0
        int n=8;
        int ans=n & (n-1);
        boolean final_ans=ans==0;
        System.out.println(final_ans);
    }
}
