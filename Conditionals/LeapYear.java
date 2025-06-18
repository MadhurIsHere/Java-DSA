package com.Madhur.Conditionals;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year number");
        int year = in.nextInt();
        if (year % 4 == 0 ) {
            System.out.println("This is leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}
