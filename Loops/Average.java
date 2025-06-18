package com.Madhur.Loops;

import java.util.Scanner;

public class Average {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total numbers of terms");
        int num = in.nextInt();
        int sum = 0;
        System.out.println("Enter the numbers 1 by 1");
        for (int i = 1; i <= num; i++) {
            int k = in.nextInt();
            sum += k;

        }
        System.out.println("Average=" + sum / num);
    }
}
