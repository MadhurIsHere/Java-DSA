package com.Madhur.Basics;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temp in C:");
        float tempc = in.nextFloat();

        float tempf = (tempc * 9 / 5) + 32;

        System.out.println(tempf);
    }
}
