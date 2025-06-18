package LeetcodeProblems;
import java.util.List;
import java.util.*;
public class P989 {
    public static void main(String[] args) {
        int[] num={9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(num,1));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int index=num.length-1;
        int carry=k;
        while(index>=0 || carry>0)
        {
            if(index>=0) // array index should not overflow
            {
                carry+=num[index]; //taking out the last element
                index--; // going to previous index
            }
            // now we had add k to number array last index if its greater than 9 then we can get the carry
            // so add the carry
            list.add(carry%10); // here is the final answer;
            carry/=10;
        }
        return list.reversed();
    }
}
