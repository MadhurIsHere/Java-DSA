package com.Madhur.Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        int c = a + b;
        System.out.println("Sum of the given two numbers " + a + " and " + b + " is " + c);
    }
}
