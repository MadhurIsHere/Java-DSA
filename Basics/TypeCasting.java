package com.Madhur.Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextInt();
        System.out.println(x);
        // explicit function (force-fully convert float data type to integer)
        int num = (int) (784.345f);
        System.out.println(num);
        // automatic type casting / promotion in expressions
        int a = 257;
        byte b = (byte) (a); // the range of byte is from -128 to 127 total number of numbers=256(2^8)
        // the code will work like 0 to 127 then -128 to 1= 257 numbers
        System.out.println(b);// output will be 1
        // promotion in the expressions as
        byte y = 125;
        byte z = 100;
        byte yz = 110;
        int zz = (y * z) / yz; // 125*110 is bigger than 127 so the jvm is storing the values in integer not in bytes
        System.out.println(zz);
    }
}
