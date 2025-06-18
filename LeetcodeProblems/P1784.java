package LeetcodeProblems;

public class P1784 {
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("110"));
    }
    public static boolean checkOnesSegment(String s) {
        // to make check that if the number is 1 or 0 if 0 the return false
        // else make check if the second number is 1 or not if not then give false
        // if the length of the string is 1 then check whether the number is 1 or 0
        if(s.length()==1)
        {
            if(s.charAt(0)=='1')
                return true;
            else
                return false;
        }
        else
        {
            if(s.charAt(0)=='1' && s.charAt(1)=='1')
                return true;
            else
                return false;
        }
    }
}
