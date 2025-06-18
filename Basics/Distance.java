package com.Madhur.Basics;

import java.util.Scanner;

public class Distance {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coordinated of first point");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter the coordinated of second point");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        float dis = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is:" + dis);
    }
}
