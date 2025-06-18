package LeetcodeProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P59 {
    public static void main(String[] args) {
        int[][] a=generateMatrix(9);
        for(int[] i:a)
        {
            System.out.println(Arrays.toString(i));
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int count=1;
        int minr=0;
        int minc=0;
        int maxc=n-1;
        int maxr=n-1;
        int total=n*n;
        while(count<=total)
        {
            for(int i=minc;i<=maxc;i++)
            {
                if(count>total)
                    break;
                ans[minr][i]=count;
                count++;
            }
            minr++;
            for(int i=minr;i<=maxr;i++)
            {
                if(count>total)
                    break;
                ans[i][maxc]=count;
                count++;
            }
            maxc--;
            for(int i=maxc;i>=minc;i--)
            {
                if(count>total)
                    break;
                ans[maxr][i]=count;
                count++;
            }
            maxr--;
            for(int i=maxr;i>=minr;i--)
            {
                if(count>total)
                    break;
                ans[i][minc]=count;
                count++;
            }
            minc++;
        }
        return ans;
    }
}
