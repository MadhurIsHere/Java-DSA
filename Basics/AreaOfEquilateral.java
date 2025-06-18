package com.Madhur.Basics;

import java.util.Scanner;

public class AreaOfEquilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of equileratal triangle");
        double a = in.nextDouble();
        double area = (Math.sqrt(3) / 4) * a * a;
        System.out.println(area);
    }
}
