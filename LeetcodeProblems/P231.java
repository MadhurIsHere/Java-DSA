package com.Madhur.LeetcodeProblems;

public class P231 {
    public static void main(String[] args) {
        int n=2;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        while(n>0)
        {
            if(n==1)
                return true;
            if(n%2!=0)
                break;
            n/=2;
        }
        return false;
    }
}
