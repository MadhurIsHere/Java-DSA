package Maths;

public class FindIthBit {
    public static void main(String[] args)
    {
        int n=16;
        int i=5;
        System.out.println(findbit(n,i));
    }
    static int findbit(int n,int i)
    {
        //create the mask by left shifting the 1 to i-1th bit
        int m=1<<(i-1);
        //now and it with the number
        return (n&m)>>i-1;
    }
}
