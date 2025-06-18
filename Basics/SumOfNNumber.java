package com.Madhur.Basics;

import java.util.Scanner;

public class SumOfNNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of numbers");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += in.nextInt();
        }
        System.out.println("The sum of " + num + " terms is: " + sum);

    }
}
