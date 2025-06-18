package com.Madhur.Loops;

import java.util.Scanner;

public class TwoDigitCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // infinite while loop
        while (true) {
            int ans = 0;
            System.out.println("Enter the operator");
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '%') {
                // input two numbers
                System.out.println("Enter two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (ch == '+') // addition
                {
                    ans = num1 + num2;
                } else if (ch == '-') // subtraction
                {
                    ans = num1 - num2;
                } else if (ch == '*') // multiplication
                {
                    ans = num1 * num2;
                } else if (ch == '/') // division
                {
                    if (num2 != 0) {
                        ans = num1 + num2;
                    }
                } else  // modulo
                {
                    ans = num1 % num2;
                }
            } else if (ch == 'x' || ch == 'X') // breaking condition
            {
                break;
            } else // other characters
            {
                System.out.println("Invalid operator");
            }
            System.out.println(ans); // answer
        }
    }
}
