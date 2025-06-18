package LeetcodeProblems;
import java.util.Arrays;
public class P1252 {
    public static void main(String[] args) {
        int[][] x={{0,1},{1,1}};
        System.out.println(oddCells(2,3,x));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[] rows=new int[m];
        int[] cols=new int[n];
        for(int[] cell: indices)
        {
            rows[cell[0]]++;
            cols[cell[1]]++;
        }
        System.out.println(Arrays.toString(rows));
        System.out.println(Arrays.toString(cols));
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((rows[i]+cols[j])%2!=0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
