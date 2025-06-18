package com.Madhur.Loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = in.nextInt();
        // copy of num;
        int cop = num;
        // let's find the length of the number
        int len = 0;
        while (cop >= 1) {
            cop = cop / 10;
            len++;
        }
        System.out.println(len);
        // we know the length so armstrong number be like
        // 153= 1*1*1 + 5*5*5 + 3*3*3 because length is 3
        cop = num;// another copy
        int add = 0;
        while (cop >= 1) {
            int x = cop % 10;
            int multi = 1;
            for (int i = 0; i < len; i++) {
                multi = x * multi;
            }
            add += multi;
            cop = cop / 10;
        }
        if (add == num) {
            System.out.print("The number is armstrong");
        } else {
            System.out.print("The number is not a armstrong");
        }
    }
}
