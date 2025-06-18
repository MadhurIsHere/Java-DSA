package com.Madhur.Patterns;

public class DoubleEquilateral {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i<5)
            {
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= 5 - i - 1; j++) {
                    System.out.print("*" + " ");
                }
            }
            else
            {
                for (int k =i+1; k<10; k++) {
                    System.out.print(" ");
                }
                for (int j =5; j <=i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
