package LeetcodeProblems;

public class P67 {
    public static void main(String[] args) {
        String a="1";
        String b="11";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        int x=Integer.parseInt(a,2);
        int y=Integer.parseInt(b,2);
        int ans=x+y;
        return Integer.toBinaryString(ans);
    }
}
