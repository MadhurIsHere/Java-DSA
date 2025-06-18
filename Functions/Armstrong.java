package com.Madhur.Functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 100; i < 1000; i++) {
            boolean ans = armstrong(i);
            if (ans == true)
                System.out.println(i);
        }
    }

    static boolean armstrong(int n) {
        int copy = n;
        int copy2 = n;
        int length = 0;
        while (copy >= 1) {
            copy /= 10;
            length++;
        }
        int sum = 0;
        if (length == 3) {
            while (copy2 >= 1) {
                sum = sum + (int) Math.pow(copy2 % 10, 3);
                copy2 /= 10;
            }
        } else {
            return false;
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}
