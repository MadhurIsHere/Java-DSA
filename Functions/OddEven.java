package com.Madhur.Functions;
import java.util.Scanner;
public class OddEven {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a desired number");
        int num = in.nextInt();
        odd_even(num);
    }

    static void odd_even(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
