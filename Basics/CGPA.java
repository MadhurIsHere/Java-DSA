package com.Madhur.Basics;

import java.util.Scanner;

public class CGPA {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your percentage");
        float per = in.nextFloat();
        System.out.println("Your CGPA are : " + (float) (per / 9.5));
    }
}
