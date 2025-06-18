package LeetcodeProblems;

public class P1309 {
    public static void main(String[] args)
    {
        System.out.println(freqAlphabets("1326#"));
    }
    public static String freqAlphabets(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            // we can check that the given character match with the #
            if(c=='#')
            {
                // as the last character is # so we have number >9
                char s1=s.charAt(i-1); // exr
                char s2=s.charAt(i-2);
                int k1=(s1-'0');
                int k2=(s2-'0');
                int k=(k2*10+k1-1);
                ans.append((char)(k+'a'));
                i=i-2;
            }
            else {
                int k3=c-'0'-1;

                ans.append((char)(k3+'a'));
            }
        }
        ans.reverse();
        return ans.toString();
    }
}
