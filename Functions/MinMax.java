package com.Madhur.Functions;

import java.util.Scanner;

public class MinMax {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int max = max(a, b);
        int min = min(a, b);
        System.out.println("Maximum of two numbers is :" + max);
        System.out.println("Minimum of two numbers is :" + min);
    }

    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }
}
