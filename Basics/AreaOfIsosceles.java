package com.Madhur.Basics;

import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the same side of the triangle");
        double b = in.nextInt();
        System.out.print("Enter the different side of the triangle");
        double a = in.nextInt();
        double area = 1.0 / 4 * (b * Math.sqrt(4 * a * a - b * b));
        System.out.println("The area of the Triangle is :" + area);
    }
}
