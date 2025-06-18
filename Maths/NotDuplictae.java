package Maths;

public class NotDuplictae {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6,2,1,5,4};
        System.out.println(NotDuplictae(a));
    }
    static int NotDuplictae(int[]a)
    {
        int ans=0;
        for(int i=0; i<a.length;i++)
        {
            ans^=a[i];
        }
        return ans;
    }
}
