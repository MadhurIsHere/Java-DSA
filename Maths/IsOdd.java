package Maths;

public class IsOdd {
    public static void main(String[] args)
    {
        System.out.println(Isodd(41111222));
    }
    public static boolean Isodd(int n)
    {
        int k=n&1;
        if(k==1)
            return true;
        else
            return false;
    }
}
