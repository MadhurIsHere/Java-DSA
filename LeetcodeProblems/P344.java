package com.Madhur.LeetcodeProblems;

import java.util.Arrays;

public class P344 {
    public static void main (String[] args)
    {
        char[] a={'h','e','l','l','o'};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    static void reverse(char[] a)
    {
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            swap(a,start,end);
            start++;
            end--;
        }
    }
    static void swap(char[] x,int a,int b)
    {
        char temp=x[a];
        x[a]=x[b];
        x[b]=temp;
    }
}
