package com.Madhur.Functions;

import java.util.Scanner;

public class PrimeBtwTwoNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the smaller number");
        int num1 = in.nextInt();
        System.out.println("Enter the larger number");
        int num2 = in.nextInt();
        prime(num1, num2);
    }

    static void prime(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            int flag = 0;
            if (i == 1 || i == 0)
                continue;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    flag++;
                break;
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }
    }
}
