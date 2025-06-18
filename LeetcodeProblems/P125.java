package LeetcodeProblems;

public class P125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        String n=s.toLowerCase();
        StringBuilder a=new StringBuilder();
        for(int i=0;i<n.length();i++)
        {
            if(Character.isLetterOrDigit(n.charAt(i)))
                a.append(n.charAt(i));
        }
        int end=a.length()-1;
        int start=0;
        while(start<=end)
        {
            if(a.charAt(start)==a.charAt(end))
            {
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }
}
