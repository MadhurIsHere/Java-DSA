package Basics;

import java.util.Scanner;

public class CompoundInterest2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principle");
        double principle = in.nextDouble();
        System.out.println("Enter the rate ");
        double rate = in.nextDouble();
        System.out.println("Enter the time");
        double time = in.nextDouble();
        double ci;
        for (int i = 1; i <= time; i++) {
            double interest = principle * rate / 100;
            principle += interest;
        }
        ci = principle;
        System.out.println(ci);
    }
}
