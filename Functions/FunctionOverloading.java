package com.Madhur.Functions;

public class FunctionOverloading {
    public static void main(String args[]) {
        over(8);
        over("madhur");
        over('a');
    }

    static void over(int a) {

        System.out.println(a);
    }

    static void over(String a) {

        System.out.println(a);
    }

    static void over(char c) {

        System.out.println((int) (c));
    }

}
