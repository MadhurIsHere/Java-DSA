package com.Madhur.Basics;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Diagonal 1");
        double d1 = in.nextInt();
        System.out.println("Enter the Diagonal 2");
        double d2 = in.nextInt();
        System.out.println("The area of parallelogram is:" + (d1 * d2) / 2);
    }
}
