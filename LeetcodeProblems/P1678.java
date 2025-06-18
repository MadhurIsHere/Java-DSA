package LeetcodeProblems;

public class P1678 {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            {
                ans.append('G');
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                ans.append('o');
                i++;
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)=='a')
            {
                ans.append('a');
                i++;
                ans.append('l');
            }
        }
        return ans.toString();
    }
}
