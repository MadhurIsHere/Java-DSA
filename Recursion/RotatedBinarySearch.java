package Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args)
    {
        int[] a={5,6,7,8,9,1,2,3,4};
        System.out.println(search(a,0,0,a.length-1));
    }
    static int search(int[] arr,int target,int s,int e)
    {
        // this is the base condition
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        // if condition is true
        if(arr[mid]==target)
            return mid;

        // if left half is sorted search inside it
        if(arr[mid]>=arr[s] )
        {
            if(target<=arr[e] && target>=arr[mid])
                return search(arr,target,s,mid-1);
            else
                return search(arr,target,mid+1,e);
        }
        // else do search in the right side;
        else
        {
            if(target>=arr[s] && target<=arr[mid])
                return search(arr,target,mid+1,e);
            else
                return search(arr,target,s,mid-1);
        }
    }
}
