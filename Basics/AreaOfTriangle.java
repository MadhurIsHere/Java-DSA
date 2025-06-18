package com.Madhur.Basics;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the triangle");
        int b = in.nextInt();
        System.out.print("Enter the height of the triangle");
        int h = in.nextInt();
        System.out.println("The area of the Triangle is :" + 0.5 * b * h);
    }
}
