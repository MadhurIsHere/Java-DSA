package com.Madhur.Functions;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[])
    {
        factorial();
    }

    static void factorial() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int fact = 1;
        while (num > 1) {
            fact *= num;
            num--;
        }
        System.out.println("The factorial of the given number is " + fact);
    }
}
