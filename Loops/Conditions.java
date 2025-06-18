package com.Madhur.Loops;
// write a program to print the sum of negative numbers,
// sum of positive number even numbers
// and the sum of positive odd numbers from a list of numbers (n) entered by the user.
// The list terminates when the user enters a 0
import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum_neg = 0, sum_odd = 0, sum_even = 0;
        boolean c = true;
        while (c) {
            int num = in.nextInt();
            if (num < 0) {
                sum_neg += num;
            } else if (num > 0 && num % 2 == 0) {
                sum_even += num;
            } else if (num > 0 && num % 2 != 0) {
                sum_odd += num;
            } else if (num == 0) {
                c = false;
            }
        }
        System.out.println("The sum of negative numbers=: " + sum_neg);
        System.out.println("The sum of positive odd numbers = " + sum_odd);
        System.out.println("The sum of positive even numbers = " + sum_even);
    }
}
