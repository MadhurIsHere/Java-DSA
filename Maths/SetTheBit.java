package Maths;

public class SetTheBit {
    public static void main(String[] args) {
        int n=12;
        int b=5;
        System.out.println(SetBit(n,b));
    }
    static int  SetBit(int n,int b) // now question is to set the ith bit to 1
            //okay so we know that during | with 1 gives 1 always one, hence I left shift the 1 to b-1th bit and OR it with the number;
    {
        return (1<<(b-1)|n);
    }
}// is there any other way to do it think....
