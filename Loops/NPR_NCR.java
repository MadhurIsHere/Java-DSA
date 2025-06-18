package com.Madhur.Loops;

import java.util.Scanner;

public class NPR_NCR {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        System.out.println("Enter the value of r");
        int r = in.nextInt();
        int r1 = r;
        int n1 = n;
        //n! p! and (n-r)!
        int a = 1;// n!
        while (n > 1) {
            a *= n;
            n--;
        }
        int b = 1; //r!
        while (r > 1) {
            b *= r;
            r--;
        }
        int c1 = n - r;
        int c = 1;//(n-r)!
        while (c1 > 1) {
            c *= c1;
            c1--;
        }
        System.out.println(a + " " + b + " " + c);
        // ncr=n!/(r!* (n-r)!)
        int ncr = a / (b * c);
        //npr=n!/(n-r)!
        int npr = a / c;
        System.out.println(ncr + "and" + npr);
    }
}
