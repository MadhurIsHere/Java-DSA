package com.Madhur.Loops;

import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int copy = num;
        int length = 0;
        while (copy >= 1)// to get the number of digits in the given number
        {
            copy /= 10;
            length++;
        }
        System.out.println(length);
        // armstrong number
        int copy1 = num;
        int arm = 0;
        for (int i = 1; i <= length; i++) {
            int reminder = copy1 % 10;
            arm = (int) Math.pow(reminder, length) + arm;
            copy1 /= 10;
        }
        if (arm == num) {
            System.out.println("The given number is armstrong");
        } else {
            System.out.println("The given number is not armstrong");
        }
    }
}
