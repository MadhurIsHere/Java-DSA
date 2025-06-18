package LeetcodeProblems;
import java.util.*;
public class P832 {
    public static void main(String[] args) {
        int[][] a={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] ans=flipAndInvertImage(a);
        for(int[] elem: ans)
        {
            System.out.println(Arrays.toString(elem));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {

        int[][] ans=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
        {
            for(int j=0,k=image[0].length-1;j<image[0].length;j++,k--)
            {
                ans[i][j]=image[i][k];
            }
        }
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                if(ans[i][j]==0)
                    ans[i][j]=1;
                else
                    ans[i][j]=0;
            }
        }
        return ans;
    }
}
