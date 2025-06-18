package com.Madhur.Basics;

import java.util.Scanner;

public class Marks {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of subjects ");
        int num = in.nextInt();
        System.out.println("Enter the marks ");
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += in.nextInt();
        }
        System.out.println("Average is : " + (float) (sum / num));
    }
}
