package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a={3,2,1,1,18,1,9,1};
        //System.out.println(Linear(a,9,0));
        ArrayList <Integer> ans= findAllIndex1(a,1,0,new ArrayList<>());
        System.out.println(ans);
    }
    static boolean Linear(int[] a,int target,int index)
    {
        if(index==a.length)
            return false;
        return (a[index]==target) || Linear(a,target,index+1);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[] arr,int target,int index)
    {
        if(index==arr.length)
            return;
        if(arr[index]==target)
            list.add(index);
        findAllIndex(arr,target,index+1);
    }
    static ArrayList findAllIndex1(int[] arr,int target,int index,ArrayList<Integer> list)
    {
        if(index==arr.length)
            return list;
        if(arr[index]==target)
            list.add(index);
        return findAllIndex1(arr,target,index+1,list);
    }
}
