package Maths;

public class OddDuplicated {
    public static void main(String[] args) {
        int[] a={4,2,4,2,3,2,4};
        System.out.println(Duplicate(a));
    }

    public static int Duplicate(int[] a) {
        int ans=0;
        int[] bits=new int[4];
        for(int num:a)
        {
            for(int i=0;i<4;i++)
            {
                bits[i]+=((num>>i)&1);
            }
        }
        for(int i=0;i<4;i++)
        {
            bits[i]%=3;
            if(bits[i]!=0)
            {
                bits[i]=bits[i]<<i;
                ans|=bits[i];
            }
        }
        return ans;
    }
}
