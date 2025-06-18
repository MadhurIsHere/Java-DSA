package com.Madhur.Basics;

import java.util.Scanner;

public class Commission {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter commission amount on the product ");
        float com = in.nextFloat();
        System.out.println("Enter the total price of the product");
        float amount = in.nextFloat();
        float percentage = com / amount * 100;
        System.out.println("The commission percentage is:" + percentage);
    }
}
