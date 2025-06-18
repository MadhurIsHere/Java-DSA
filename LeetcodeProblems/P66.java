package LeetcodeProblems;

import java.util.*;

public class P66 {
    public static void main(String[] args) {
        int[] num={1,2,3};
        System.out.println(Arrays.toString(plusOne(num)));
    }
    public static int[] plusOne(int[] digits) {
        int[] ans=new int[digits.length+1];
        int index=digits.length-1;
        int carry=1;
        while(index>=0 || carry>0)
        {
            if(index>=0)
            {
                carry+=digits[index];
                index--;
            }
            ans[index+1]=carry%10;
            carry/=10;
        }
        if(ans[0]==0 )
        {
            return Arrays.copyOfRange(ans,1,ans.length);
        }
        else if(ans[ans.length-1]==0 )
        {
            return Arrays.copyOfRange(ans,0,ans.length-1);
        }
        return ans;
    }
}
