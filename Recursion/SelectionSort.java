package Recursion;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] a={5,3,2,0,1,4};
        selection(a,0,a.length-1,0);
        System.out.println(Arrays.toString(a));
    }
    static void selection(int[] arr,int index,int end,int max)
    {
        if(end==0)
            return;
        if(index<end)
        {
            if (arr[index] > arr[max])
            {
                selection(arr, index + 1, end, index);
            }
            else
            {
                selection(arr, index + 1, end, max);
            }
        }
        else
        {
            swap(arr,index,max);
            selection(arr,0,end-1,max);
        }
    }
    static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
