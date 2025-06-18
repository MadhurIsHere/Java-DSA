package com.Madhur.Basics;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int l = in.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int b = in.nextInt();
        System.out.println("The area of the Rectangle is:" + b * l);
    }
}
