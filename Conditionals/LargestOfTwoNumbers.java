package com.Madhur.Conditionals;

import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = in.nextInt();
        System.out.println("Enter second number");
        int b = in.nextInt();
        if (a > b) {
            System.out.print(a);
        } else {
            System.out.println(b);
        }
    }
}
