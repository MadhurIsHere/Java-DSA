package com.Madhur.Recursion;

public class BinarySearch {
    public static void main(String[] args)
    {
        int[]  a={1,2,3,66,78,98,121};
        System.out.println(search(a,78,0,a.length-1));
    }
    static int search(int[] a,int target,int s,int e)
    {
         if(s>e)
            return -1;
        int m=s+(e-s)/2;
        if(target==a[m])
            return m;
        if (target>a[m])
            return search(a,target,m+1,e);
        return search(a,target,s,m-1);
    }
}
