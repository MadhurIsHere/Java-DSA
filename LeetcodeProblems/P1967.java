package LeetcodeProblems;

public class P1967 {
    public static void main(String[] args) {
        String[] patterns = {"a", "b", "c"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));

    }
    public static int numOfStrings(String[] patterns, String word) {
        int ans=0;
        for(String elem: patterns)
        {
            if(word.contains(elem))
            {
                ans++;
            }
        }
        return ans;
    }
}
