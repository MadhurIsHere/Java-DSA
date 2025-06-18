package com.Madhur.Conditionals;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of unit");
        double unit = in.nextDouble();
        double bill = 0;
        if (unit <= 100) {
            bill = unit * 2;
        } else if (unit <= 200) {
            bill = 100 * 2 + (unit - 100) * 3;
        } else if (unit <= 300) {
            bill = 100 * 2 + 100 * 3 + (unit - 200) * 4;
        } else {
            bill = 100 * 2 + 100 * 3 + 100 * 4 + (unit - 300) * 5;
        }
        System.out.println("The bill is :" + bill);
    }
}
