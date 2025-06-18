package com.Madhur.Sortings;
import java.util.Arrays;
public class SelectionRevision {
    public static void main(String[] args) {
        int[] a = {-3, 0,4, 5, 1, 2, 3};
        selection(a);
        System.out.println(Arrays.toString(a));
    }
    static void selection(int[] arr)
    {
        for(int i= arr.length-1;i>=0;i--)
        {
            int ind=max(arr,0,i);
            swap(arr,i,ind);
        }
    }
    static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int max(int[] arr,int start, int end)
    {
        int ans=start;
        for(int i=start+1;i<=end;i++)
        {
            if(arr[i]>arr[ans])
            {
                ans=i;
            }
        }
        return ans;
    }
}
