package com.Madhur.complexity;

public class FormulaForFibo {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++)
        {
            System.out.println(fibo(i));
        }
    }
    static long fibo(int n)
    {
        return (long)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
