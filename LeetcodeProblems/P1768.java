package LeetcodeProblems;

public class P1768 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd","pq"));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int i=0; // word1
        int j=0; // word2
        while(i< word1.length() || j<word2.length())
        {
            if(i<word1.length() )
            {
                ans.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length())
            {
                ans.append(word2.charAt(j));
                j++;
            }

        }
        return ans.toString();
    }
}
