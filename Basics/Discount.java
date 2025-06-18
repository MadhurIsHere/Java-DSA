package com.Madhur.Basics;

import java.util.Scanner;

public class Discount {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Cost price of the product");
        float cp = in.nextFloat();
        System.out.println("Enter the discount % of the product");
        float dis = in.nextFloat();
        float sp = cp - cp * dis / 100;
        System.out.println("Discounted price is :" + sp);
    }
}
