package LeetcodeProblems;

public class P657 {
    public static void main(String[] args)
    {
        String a="UDRLD";
        System.out.println(judgeCircle(a));
    }
    public static boolean judgeCircle(String moves) {
        int count1=0; // up and down
        int count2=0;
        for(int i=0;i<moves.length();i++)
        {
            char c=moves.charAt(i);
            if(c=='U')
            {
                count1--;
            }
            else if (c=='D')
            {
                count1++;
            }
            else if(c=='R')
            {
                count2++;
            }
            else
            {
                count2--;
            }
        }
        return (count1==0 && count2==0);
    }

}
