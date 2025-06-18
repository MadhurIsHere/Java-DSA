package com.Madhur.Functions;
import java.util.Scanner;
public class Grade {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int sub = in.nextInt();
        for (int i = 0; i < sub; i++) {
            grades();
        }
    }
    static void grades() {
        Scanner in = new Scanner(System.in);
        int grades = in.nextInt();
        if (grades <= 100 && grades > 90) {
            System.out.println("AA");
        } else if (grades > 80) {
            System.out.println("AB");
        } else if (grades > 70) {
            System.out.println("BB");
        } else if (grades > 60) {
            System.out.println("BC");
        } else if (grades > 50) {
            System.out.println("CD");
        } else if (grades > 40) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }
}
