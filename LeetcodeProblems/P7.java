package LeetcodeProblems;

public class P7 {
    public static void main (String[] args)
    {
        System.out.println(reverse(-987654399));
    }
    public static int reverse(int x) {
        int rev=0;
        if(x>0) {
            while (x > 0) {
                rev = (rev << 3) + (rev << 1) + x % 10;
                x /= 10;
            }
        }
        else
        {
            x=~x+1;
            while (x > 0) {
                rev = (rev << 3) + (rev << 1) + x % 10;
                x /= 10;
            }
        }
        return rev;
    }
}
