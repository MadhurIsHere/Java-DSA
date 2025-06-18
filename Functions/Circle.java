package com.Madhur.Functions;

import java.util.Scanner;

public class Circle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = in.nextInt();
        circle(radius);
    }

    static void circle(int radius) {
        double circum = 2 * radius * 22 / 7;
        double area = radius * radius * 22 / 7;
        System.out.println("The circumference of the circle is: " + circum);
        System.out.println("The area of the circle is: " + area);
    }
}
