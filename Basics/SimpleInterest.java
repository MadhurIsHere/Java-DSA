package com.Madhur.Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principal");
        float p = in.nextFloat();
        System.out.println("Enter the Time");
        float t = in.nextFloat();
        System.out.println("Enter the Rate");
        float r = in.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println("The simple interest is:" + si);
    }
}
