package com.Madhur.Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fibo = 1;
        int fibo2 = 1;
        System.out.print("Enter the nth number ");
        int n = in.nextInt();
        System.out.print(fibo + " ");
        System.out.print(fibo2 + " ");
        for (int i = 2; i <= n; i++) {
            int y = fibo + fibo2;
            fibo = fibo2;
            fibo2 = y;
            System.out.print(y + " ");
        }
    }
}
