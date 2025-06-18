package com.Madhur.Functions;

import java.util.Scanner;

public class SumOfN {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sum(n);
    }

    static void sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
