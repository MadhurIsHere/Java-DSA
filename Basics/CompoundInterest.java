package com.Madhur.Basics;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principle");
        double principle = in.nextDouble();
        System.out.println("Enter the rate ");
        double rate = in.nextDouble();
        System.out.println("Enter the time");
        double time = in.nextDouble();
        double ci = principle * Math.pow((1 + rate / 100), time);
        System.out.println("The compound interest is : " + ci);

    }
}
