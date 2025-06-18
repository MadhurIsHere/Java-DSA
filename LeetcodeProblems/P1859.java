package LeetcodeProblems;

public class P1859 {
    public static void main(String[] args)
    {
        String s= "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        StringBuilder ans=new StringBuilder(); // using stringbuilder to increase the efficiency of the program
        String[] str=s.split(" "); // spliting the array by using the split fn as there is only white space
        String[] arrange=new String[str.length]; // this will store the final rearranged string
        for(String elem: str)
        {
            int i=(int)(elem.charAt(elem.length()-1)-48);
            arrange[i-1]=elem.substring(0,elem.length()-1);
        }
        for(int i=0;i<arrange.length;i++) {
            ans.append(arrange[i]);
            if(i!=arrange.length-1)
                ans.append(" ");
        }
        return ans.toString();
    }
}
