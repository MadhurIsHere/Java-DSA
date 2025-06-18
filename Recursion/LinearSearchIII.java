package Recursion;
import java.util.ArrayList;
public class LinearSearchIII {
    public static void main(String[] args) {
        int[] a={1,2,3,4,4,8};
        System.out.println(find(a,4,0));
    }
    static ArrayList find(int[] a,int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==a.length)
            return list;
        if(a[index]==target)
            list.add(index);
        ArrayList<Integer> ansFromBelowCalls= find(a,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
