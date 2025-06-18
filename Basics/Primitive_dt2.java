package com.Madhur.Basics;

import java.util.Scanner;

public class Primitive_dt2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int integer = in.nextInt();
        System.out.println("Your integer value is " + integer);
        System.out.println("What is your name");
        String name = in.nextLine();
        System.out.println("My name is :" + name);
        System.out.println("Enter your percentage");
        float percentage = in.nextFloat();
        System.out.println("My percentage is :" + percentage);
    }
}
