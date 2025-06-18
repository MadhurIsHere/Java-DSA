package LeetcodeProblems;

public class P557 {
    public static void main(String[] args) {
        String name="Let's take Leetcode contest";
        System.out.println(reverseWords(name));
    }
    public static String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(String elem: arr)
        {
            for(int i=elem.length()-1;i>=0;i--)
            {
                ans.append(elem.charAt(i));
            }
            ans.append(' ');
        }
        return ans.toString().trim();
    }
}
