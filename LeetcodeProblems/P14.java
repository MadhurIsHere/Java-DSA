package LeetcodeProblems;

public class P14 {
    public static void main(String[] args) {
        String[] name1={"madhur","hur","hu"};

        System.out.println(longestCommonPrefix(name1));
    }
    public static String longestCommonPrefix(String[] strs) {

        int min= Integer.MAX_VALUE;
        int k=0;
        for(String str:strs)
        {
            if(str.length()<min)
            {
                k++;
                min=str.length();
            }
        }
        StringBuilder ans=new StringBuilder();
        String shortest=strs[k];
        for(int i=0;i<min;i++)
        {

            char c=shortest.charAt(i);
            ans.append(c);
            for(String str:strs)
            {
                if(!str.startsWith(ans.toString()))
                    return ans.substring(0,ans.length()-1);
            }
        }
        return ans.toString();
    }
}
