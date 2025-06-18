package Maths;

public class ResetTheBit {
    public static void main(String[] args) {
        int n=12;// given number
        int b=4; //the bit to be reset
        System.out.println(SetTheBit(n,b));
    }
    static int SetTheBit(int n,int b)
    {// basic approach is that set the mask by doing left shift of 0 and then do bitwise AND with that mask
        int mask=~(1<<(b-1)); // so inorder to get a required mask just left shift the 1 to b-1th bit and then use NOT operator
        return mask&n;
    }
}
