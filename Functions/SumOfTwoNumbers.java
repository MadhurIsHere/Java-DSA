package com.Madhur.Functions;
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        sum(a, b);
    }
    static void sum(int a, int b)
    {
        System.out.println("The sum is:" + (a + b));
    }
}
