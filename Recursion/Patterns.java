package Recursion;

public class Patterns {
    public static void main(String[] args)
    {
        pattern(4,4);
        pattern2(4,4);
    }
    static void pattern(int row,int col)
    {
        if(row==0)
            return;
        if(row==col)
        {
            System.out.println(' ');
            pattern(row-1,0);
        }
        if(col<row) {
            System.out.print("* ");
            pattern(row,col+1);
        }
    }
    static void pattern2(int row, int col)
    {
        if(row==0)
            return;
        if(row==col)
        {
            pattern2(row-1,0);
            System.out.println();
        }
        else
        {
            pattern2(row,col+1);
            System.out.print("* ");
        }
    }
}
