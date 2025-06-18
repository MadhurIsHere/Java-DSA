package LeetcodeProblems;

public class P28 {
    public static void main(String[] args)
    {
        String haystack="s1adbutsad";
        String needle="sad";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
        {
            return haystack.indexOf(needle);
        }
        else
            return -1;
    }
}
