package com.Madhur.String;

import java.util.*;
public class Method {
    public static void main(String[] args) {
        String a="Madhur Rastogi";
        System.out.println(a.length()); // gives the length string
        System.out.println(a   +  "is best"); // concat the strings
        System.out.println(a.concat("is best"));// also concat the string
        System.out.println(a.toLowerCase()); // coverts to lower case
        System.out.println(a.toUpperCase()); // converts to upper case
        System.out.println(a.charAt(5)); // return the character at the index
        System.out.println(a.compareTo("Madhur Rastogi")); // return +ve if the main string is bigger than the second and vice versa
        System.out.println(a.equals("Madhur Rastogi")); // return boolean data type
        System.out.println(a.equalsIgnoreCase("MADHUR RASTOGI")); // ignore the case and return the boolean value
        System.out.println(a.indexOf('a')); // return the index
        System.out.println("   Madhur  ".trim()); // remove the space from the start and the end;
        System.out.println(a.strip()); // better than trim
        System.out.println("".isBlank()); // return the boolean ans true if string is ""
        System.out.println("".isEmpty()); // returns th boolean ans, true if length is 0
        System.out.println(Arrays.toString(a.toCharArray()));
        System.out.println(a.replace("a","@"));
        String[] k=a.split(""); // return the answer in the form of array
        System.out.println(Arrays.toString(k));
        System.out.println(a.getClass());
        System.out.println(a.replaceAll("a","2"));
        System.out.println(a.lastIndexOf('a'));

    }
}
