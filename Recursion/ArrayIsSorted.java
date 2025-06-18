package Recursion;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,99,86};
        System.out.println(sorted(a));
    }
    static boolean sorted(int[] a)
    {
        return helper(a,0,a.length-1);
    }
    static boolean helper(int[] a, int start,int end)
    {
        if(start==end)
            return true;
        if(a[start]<a[start+1])
            return helper(a,start+1,end);
        return false;
    }
}
