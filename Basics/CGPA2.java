package com.Madhur.Basics;

import java.util.Scanner;

public class CGPA2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your total grades");
        float grades = in.nextFloat();
        System.out.println("Enter total subjects");
        int total = in.nextInt();
        float cgpa = grades / total;
        System.out.println("The cgpa are : " + cgpa);
    }
}
