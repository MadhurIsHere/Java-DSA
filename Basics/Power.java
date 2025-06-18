package com.Madhur.Basics;

import java.util.Scanner;

public class Power {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and power respectively ");
        int base = in.nextInt();
        int power = in.nextInt();
        System.out.println("The power is the given base is : " + (int) Math.pow(base, power));
    }
}
