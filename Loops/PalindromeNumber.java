package com.Madhur.Loops;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int copy = num;
        int length = String.valueOf(num).length();
        int reverse = 0;
        for (int i = 1; i <= length; i++) {
            int reminder = copy % 10;
            reverse = reverse * 10 + reminder;
            copy /= 10;
        }
        if (reverse == num) {
            System.out.println("palindrome");
        } else
            System.out.println("Not palindrome");
    }
}
