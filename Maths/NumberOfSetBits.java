package Maths;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n=9;
        int k=0;
        while(n>0)
        {
            int x=(n-(n&(-n)));
            n&=x;
            k++;
        }
        System.out.println(k);
    }
}
