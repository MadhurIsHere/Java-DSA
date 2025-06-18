package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome1(121));
    }
    // easy way just reverse the number and check weather the reverse number is equal to the original ?
    static boolean palindrome(int n)
    {
        int digits=(int)(Math.log10(n))+1;
        int rev=helper(n,digits);

        if(rev==n)
            return true;
        else
            return false;
    }
    static int helper(int n,int digits)
    {
        if(n%10==n)
            return n;
        int reminder=n%10;
        return reminder*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }

    //another way just use two pointer method using recursion :)
    static boolean palindrome1(int n)
    {
        int start=0;
        int end=(int)(Math.log10(n))+1;
        return helper1(n,start,end);
    }
    static boolean helper1(int n,int start,int end)
    {
        if(n%10==n)
            return true;
        // last digit;
        int ld=n%10;
        // starting digit;
        int sd=n/(int)(Math.pow(10,end-1));
        if(ld==sd)
            return helper1((n-(sd*(int)(Math.pow(10,end-1))+ld))/10,start+1,end-1);
        else
            return false;
    }
}
