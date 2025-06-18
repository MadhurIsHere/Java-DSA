package LeetcodeProblems;

public class P1662 {
    public static void main(String[] args) {
        String[] word1={"ab", "c"};
        String[] word2={"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        for(String i:word1)
        {
            a.append(i);
        }
        for(String i: word2)
        {
            b.append(i);
        }
        return a.toString().equals(b.toString());
    }
}
