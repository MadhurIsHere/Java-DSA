package com.Madhur.Basics;

import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the money in INR");
        float inr = in.nextFloat();
        double usd = inr * 0.0119211;
        System.out.println("The amount in usd :" + usd);
    }
}
