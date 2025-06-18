package com.Madhur.Recursion;

public class Infinite {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n)
    {
        if(n==10000)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
