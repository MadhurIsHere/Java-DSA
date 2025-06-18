package LeetcodeProblems;

public class P1668 {
    public static void main(String[] args) {
        System.out.println(maxRepeating("aaaaaa", "a") == 6);
        System.out.println(maxRepeating("abcabcabc", "abc") == 3);
        System.out.println(maxRepeating("abababab", "aba") == 2);
        System.out.println(maxRepeating("bbbbbbb", "b") == 7);
        System.out.println(maxRepeating("xyzxyzxyz", "abc") == 0);
        System.out.println(maxRepeating("abc", "abcdef") == 0);
        System.out.println(maxRepeating("", "a") == 0);
        
        System.out.println(maxRepeating("xyz", "xyz") == 1);
        System.out.println(maxRepeating("ababababab", "ab") == 5);
        System.out.println(maxRepeating("aaaa", "aa") == 2);
        System.out.println(maxRepeating("axaxaxax", "ax") == 1);
        System.out.println(maxRepeating("abcdefabcdef", "def") == 2);
        System.out.println(maxRepeating("z".repeat(1000), "z") == 1000);
        System.out.println(maxRepeating("abc".repeat(1000), "abcabc") == 500);
        System.out.println(maxRepeating("a".repeat(1000), "b") == 0);
        System.out.println(maxRepeating("abababababababababab", "abab") == 5);
        System.out.println(maxRepeating("aaaaaaaabc", "abc") == 1);
        System.out.println(maxRepeating("ab" + "a".repeat(10_000) + "ab", "aa") == 5000);
    }
    public static int maxRepeating(String sequence, String word) {
        int ans=0;
        StringBuilder repeated=new StringBuilder(word);
        while(sequence.contains(repeated))
        {
            repeated.append(word);
            ans++;
        }
        return ans;
    }
}
