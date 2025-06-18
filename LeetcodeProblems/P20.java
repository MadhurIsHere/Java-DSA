package LeetcodeProblems;

public class P20 {
    public static void main(String[] args) {
        String name="(((]]][[[)))";
        System.out.println(isValid(name));
    }
    public static boolean isValid(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                sum+=1;
            }
            else if(s.charAt(i)==')')
            {
                sum-=1;
            }
            else if(s.charAt(i)=='[')
            {
                sum+=2;
            }
            else if(s.charAt(i)==']')
            {
                sum-=2;
            }
            else if(s.charAt(i)=='{')
            {
                sum+=3;
            }
            else if(s.charAt(i)=='}')
            {
                sum-=3;
            }
        }
        return sum==0;
    }
}
