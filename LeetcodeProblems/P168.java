package LeetcodeProblems;

public class P168 {
    public static void main(String[] args)
    {
        System.out.println(convertToTitle(100));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder ans=new StringBuilder();
        while(columnNumber>0) {
            // take out reminder;
            int reminder = (columnNumber-1) % 26;
            ans.append((char)(reminder+'A'));
            columnNumber=(columnNumber-1)/26;
        }
        return ans.reverse().toString();
    }
}
