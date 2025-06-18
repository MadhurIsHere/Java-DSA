package Arrays;

import java.util.*;

public class Printing {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        //method 1
        String[] str;
        str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // method 2
        String[] str2 = new String[4];
        for (int i = 0; i < str2.length; i++) {
            str2[i] = in.next();
        }
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i] + " ");
        }

        //method 3
        String[] str3 = new String[4];
        for (int i = 0; i < str3.length; i++) {
            str3[i] = in.next();
        }
        for (String i : str3) {
            System.out.print(i + " ");
        }
    }
}
