package com.Madhur.Loops;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = prime(n);
        System.out.println(ans);
    }

    static boolean prime(int a) {
        if (a <= 1)
            return false;
        int c = 2;
        while (c * c <= a) {
            if (a % c == 0) {
                return false;
            }
            c++;
        }
        if (c * c > a)
            return true;
        else
            return false;
    }
}
