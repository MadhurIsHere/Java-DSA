package Maths;

public class Bit {
    public static void main(String[] args) {
        int n=12;// number given to us
        int b=1; // nth bit to know
        System.out.println(Bit(n,b));
    }
    static int Bit(int n, int b)
    { // so what's happening here is we make a left shift in the 1 and AND it with the number we get the answer but in decimal form to get desired output we need to right shift it again
        //return ((1<<b-1)&n)>>b-1;
        // or just make a right shift in the number with the given bit and AND with 1;
        return (n>>b-1)&1;
    }
}
