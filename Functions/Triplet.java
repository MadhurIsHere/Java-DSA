package com.Madhur.Functions;

import java.util.Scanner;

public class Triplet {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter any three numbers");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    pythagorean(a, b, c);
    }
    static void pythagorean(int a, int b, int c) {
        if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
            System.out.println("Pythagorean triplets");
        } else if (Math.pow(b, 2) == (Math.pow(a, 2) + Math.pow(c, 2))) {
            System.out.println("Pythagorean triplets");
        } else if (Math.pow(c, 2) == (Math.pow(b, 2) + Math.pow(a, 2))) {
            System.out.println("Pythagorean triplets");
        } else {
            System.out.println("invalid values");
        }
    }
}
