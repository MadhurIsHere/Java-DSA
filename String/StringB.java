package com.Madhur.String;

public class StringB {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char c=(char)('a'+i);
            s.append(c);
        }
        System.out.println(s);
        // methods of string builder
    }
}
