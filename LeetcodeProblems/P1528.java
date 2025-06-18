package LeetcodeProblems;

public class P1528 {
    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            ans.append(i);
        }
        for(int i=0;i<indices.length;i++)
        {
            ans.setCharAt(indices[i],s.charAt(i));
        }
        return ans.toString();
    }
}
