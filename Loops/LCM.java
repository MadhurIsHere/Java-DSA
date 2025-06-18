package com.Madhur.Loops;

import java.util.Scanner;

public class LCM {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number ");
        int a = in.nextInt();
        int b = in.nextInt();
        int min = Math.min(a, b);
        int lcm = 0;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
