package Recursion;
import java.util.ArrayList;
public class LinearSearchList {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,4,8};
        int target=4;
        ArrayList<Integer> ans=list(a,target,0,new ArrayList<>());
        System.out.println(ans);

    }
    static ArrayList list(int[] a,int target,int index,ArrayList<Integer> list1)
    {
        if(index==a.length)
        {
            return list1;
        }
        if(a[index]==target)
            list1.add(index);
        return list(a,target,index+1,list1);
    }
}
