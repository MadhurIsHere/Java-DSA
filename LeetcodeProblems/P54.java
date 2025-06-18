package LeetcodeProblems;
import java.util.List;
import java.util.ArrayList;
public class P54 {
    public static void main(String[] args) {
        int [][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(spiralOrder(a));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int cmin=0;
        int cmax=matrix[0].length-1;
        int rmin=0;
        int rmax=matrix.length-1;
        int count=0;
        int total=matrix.length*matrix[0].length;
        while(count<total)
        {
            // for the top side row
            for(int i=cmin;i<=cmax;i++)
            {
                if(count==total)
                    break;
                ans.add(matrix[rmin][i]);
                count++;
            }
            rmin++;
            // for right side column
            for(int i=rmin;i<=rmax;i++)
            {
                if(count==total)
                    break;
                ans.add(matrix[i][cmax]);
                count++;
            }
            cmax--;
            // for bottom row
            for(int i=cmax;i>=cmin;i--)
            {
                if(count==total)
                    break;
                ans.add(matrix[rmax][i]);
                count++;
            }
            rmax--;
            // for left side column
            for(int i=rmax;i>=rmin;i--)
            {
                if(count==total)
                    break;
                ans.add(matrix[i][cmin]);
                count++;
            }
            cmin++;
        }
        return ans;
    }
}
