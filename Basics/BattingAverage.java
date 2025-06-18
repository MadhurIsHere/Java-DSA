package com.Madhur.Basics;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total number of runs");
        int run = in.nextInt();
        System.out.println("Enter the total number of dismissals");
        int dism = in.nextInt();
        System.out.println("The batting average is : " + (float) (run / dism));
    }
}
