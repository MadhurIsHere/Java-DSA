package com.Madhur.LeetcodeProblems;

public class P1342 {
    public static void main(String[] args) {
        int num=4;
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
        int count=0;
        while(num>0) // always true
        {
            if (num % 2 == 0) {
                num /=2;
            }
            else {
                num -= 1;
            }
            count++;
        }
        return count;
    }
}
