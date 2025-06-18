package Maths;

public class PascalTriangle {
    public static void main(String[] args) {
        //nC0+nC1+nC2+nC3.... nCn =2^n-1
        int n=6;
        // the sum for the nth row is 2^n-1
        //now do it in binary.... left shift is a<<b=2^b*a
        int sum=1<<(n-1);
        System.out.println(sum);
    }
}
