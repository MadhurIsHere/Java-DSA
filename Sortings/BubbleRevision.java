package com.Madhur.Sortings;

import java.util.Arrays;

public class BubbleRevision {
    public static void main(String[] args)
    {
        int[] a={7,5,6,3,1,2,4};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubble(int[] arr)
    {
        // to terminate if the array is already sorted or not
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr.length-i-1;j++)
            {
                if (arr[j-1]>arr[j])
                {
                    swap(arr,j-1,j);
                    flag=false;
                }
            }
            if (flag)
            {
                break;
            }
        }
    }
    static void swap(int[] arr,int x, int y)
    {
        arr[x]=arr[x]+arr[y];
        arr[y]=arr[x]-arr[y];
        arr[x]=arr[x]-arr[y];
    }
}
