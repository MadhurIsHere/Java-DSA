package LeetcodeProblems;

public class P1704 {
    public static void main(String[] args)
    {
        String s="book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        int count1=0,count2=0;
        int length=s.length()/2;
        for(int i=0;i<length;i++)
        {
            char a=s.charAt(i);
            char b=s.charAt(i+length);
            if( a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
                count1++;
            if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u' || b=='A' || b=='E' || b=='I' || b=='O' || b=='U')
                count2++;
        }
        return count2==count1;

    }
}
