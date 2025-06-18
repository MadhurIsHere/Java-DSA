package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={4,5,2,1};
        sort(a,a.length-1,0);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int[] arr,int row,int col)
    // here row=the length-1 and col is the index of the array
    // its like looking the array from another perspective
    {
        if(row==0)
            return;
        if(col<row)
        {
            if(arr[col]>arr[col+1])
            {
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            sort(arr,row,col+1);
        }
        else
        {
            sort(arr,row-1,0);
        }
    }
}
