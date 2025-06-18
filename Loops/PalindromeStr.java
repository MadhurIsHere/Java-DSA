package com.Madhur.Loops;

import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string");
        String name = in.next();
        name = name.toLowerCase();
        int x = name.length();
        int y = x;
        boolean a = true;
        for (int i = 0; i < x; i++) {
            if (name.charAt(i) == name.charAt(y - 1)) {
                a = true;
            } else {
                a = false;
            }
            y--;
        }
        if (a == true) {
            System.out.println("The Given String is Palindrome");
        } else {
            System.out.println("The Given String is Not A Palindrome");
        }
    }
}
