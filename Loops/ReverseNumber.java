package com.Madhur.Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int y = n;// copy of number
        int ans = 0;
        while (y > 0) {
            int r = y % 10;
            ans = ans * 10 + r;
            y = y / 10;
        }
        System.out.println(ans);
    }
}
