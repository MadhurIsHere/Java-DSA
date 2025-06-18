package com.Madhur.String;

public class TwoPointersPalindrome {
    public static void main(String[] args) {
        String a="a'cba";
        int start=0;
        int end=a.length()-1;
        boolean check=true;
        while(start<=end)
        {
            if(a.charAt(start) == a.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                check=false;
                break;
            }
        }
        if(check)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
