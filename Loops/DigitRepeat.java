package com.Madhur.Loops;

import java.util.Scanner;

public class DigitRepeat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = in.nextLong();
        System.out.println("Enter the required digit");
        int x = in.nextInt();
        int count = 0;
        while (n > 0) {
            long y = n % 10;
            if (y == x) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
