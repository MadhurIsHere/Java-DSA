package com.Madhur.Patterns;

public class IsocelesTriangle {
    public static void main(String[] args) {
        int k;
        for(int i=0;i<10;i++)
        {
            if(i<5)
            {
                k=i;
            }
            else
            {
                k=10-i;
            }
            for(int j=0;j<=k;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
