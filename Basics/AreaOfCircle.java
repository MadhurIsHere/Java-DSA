package com.Madhur.Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = in.nextDouble();
        System.out.println("The area of the circle is :" + 3.141592653589793238462643 * r * r);
    }
}
