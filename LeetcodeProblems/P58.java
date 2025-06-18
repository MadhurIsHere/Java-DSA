package LeetcodeProblems;

public class P58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello mahur"));
    }
    public static int lengthOfLastWord(String s) {
        String[] a=s.split(" ");
        return a[a.length-1].length();
    }
}
