package com.Madhur.Functions;

import java.util.Scanner;

public class NGreaterThan18 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        age(age);
    }

    static void age(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else
            System.out.println("Not eligible to vote");

    }
}
