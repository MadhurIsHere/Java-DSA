package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class P73 {
    public static void main(String[] args) {
        int a[][]={
                {0,1,1},
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(a);
        for(int[] row: a)
        {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> x=new ArrayList<>();
        ArrayList<Integer> y=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    x.add(i);
                    y.add(j);
                }
            }
        }
        // set all elements of rows to 0

        for(int k: x) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[k][i] = 0;
            }
        }
            // set all elements of column to 0
        for(int k:y) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][k] = 0;
            }
        }
    }
}
