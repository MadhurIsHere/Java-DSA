package com.Madhur.Loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = in.next();
        int len = word.length();
        int l = len;
        String reverse = "";
        for (int i = 0; i < len; i++) {

            reverse += word.charAt(l - 1);
            l--;
        }
        System.out.println(reverse);
    }
}
