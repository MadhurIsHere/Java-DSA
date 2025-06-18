package com.Madhur.Loops;
import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;
public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        in.close();

        float c = min(a, b);// smaller number
        float hcf = 0;// bigger number
        float divider = 2; // factors
        float lcm = max(a, b); // smaller number

        while (c > 1) //smaller number should be greater than 1
        {
            if (a % divider == 0 && b % divider == 0) // factors should be common
            {
                lcm = min(lcm, divider);
                hcf = max(hcf, divider);
                c = c / divider; // dividing the condition

            }
            divider++; // divider increment
        }
        System.out.println("Lcm is " + lcm);
        System.out.println("Hcf is" + hcf);
    }
}
