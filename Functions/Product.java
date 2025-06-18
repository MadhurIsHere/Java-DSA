package com.Madhur.Functions;

import java.util.Scanner;

public class Product {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        product(a, b);
    }
    static void product(int a, int b)
    {
        System.out.println("The product of the given two numbers =:" + (a * b));
    }
}
