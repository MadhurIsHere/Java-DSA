package com.Madhur.Conditionals;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String fruit = in.next();

//        if (fruit.equals("mango"))
//        {
//            System.out.println("King of fruits");
//        }


//         switch(fruit)
//         {
//             case "Mango":
//                 System.out.println("King of fruits");
//                 break ;
//             case "Apple":
//                 System.out.println("A sweet red fruit");
//                 break;
//             case "Orange":
//                 System.out.println("Round fruit");
//                 break;
//             case "Grapes":
//                 System.out.println("Smaller fruit");
//             default :
//                 System.out.println("Please enter a true case");

        // advance or new type of code
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits ");
            case "Apple" -> System.out.println("Red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
