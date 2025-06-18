package com.Madhur.Patterns;
//     *
//    * *
//   *   *
//  *     *
// *********
public class Empty {
    public static void main(String[] args) {
        int i,j,k,l;
        for(i=0;i<5;i++)
        {
            for (j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            for (k=1;k<=2*i+1;k++)
            {
                if(k==1 || k==2*i+1 || i==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
