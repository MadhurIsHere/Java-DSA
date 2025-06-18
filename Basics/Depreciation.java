package com.Madhur.Basics;
//08 calculate depreciation of value  v2=v1*Math.pow((1-rate/100),time)
import java.util.Scanner;
public class Depreciation {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the original value of the product/item");
        float v1 = in.nextFloat();
        System.out.println("Enter the depreciation rate of the product");
        float rate = in.nextFloat();
        System.out.println("Enter the time period (in years)");
        float time = in.nextFloat();
        double v2 = Math.round(v1 * Math.pow((1 - rate / 100), time));
        System.out.println("The depreciation value of the product is : " + v2);
    }
}
