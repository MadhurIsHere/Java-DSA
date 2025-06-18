package com.Madhur.Conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.print("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
