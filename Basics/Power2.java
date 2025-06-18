package com.Madhur.Basics;

import java.util.Scanner;

public class Power2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and the power respectively");
        int base = in.nextInt();
        int power = in.nextInt();
        int product = 1;
        for (int i = 1; i <= power; i++) {
            product *= base;
        }
        System.out.println("The power of the given base is : " + product);

    }
}
