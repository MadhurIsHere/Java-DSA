package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        // output 1
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // method 3
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
