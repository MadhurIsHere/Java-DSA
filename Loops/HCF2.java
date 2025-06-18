package com.Madhur.Loops;

import java.util.Scanner;

public class HCF2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int min = Math.min(a, b);
        int hcf = 0;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
