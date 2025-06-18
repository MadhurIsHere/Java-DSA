package Maths;

public class Twice {
    public static void main(String[] args)
    {
        int[] n={1,2,3,5,63,2,1,3,5};
        System.out.println(duplicate(n));
    }

    static int duplicate(int[] n) {
        int ans=0;
        for(int i: n)
        {
            ans=ans^i;
        }
        return ans;
    }
}
