package Maths;

public class SetBit {
    public static void main(String[] args)
    {
        int n=12;
        int i=4;
        System.out.println(Setbit(n,i));
    }

    private static int Setbit(int n, int i) {
        // use or operator
        int mask=1<<i-1;
        return n&mask;
    }
}
