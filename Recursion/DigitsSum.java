package Recursion;

public class DigitsSum {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(sumOfDigits(n));
    }
    static int sumOfDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int reminder=n%10;
        return reminder+sumOfDigits(n/10);
    }
}
