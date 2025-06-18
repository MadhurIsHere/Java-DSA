package LeetcodeProblems;

public class P925 {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("vtkgn","vttkgnn"));
    }
    public static boolean isLongPressedName(String name, String typed) {
        int a=0; //pointer for name;
        int b=0; // pointer for typed
        while(b<typed.length())
        {
            if(a<name.length() && name.charAt(a)==typed.charAt(b))
            {
                a++;
                b++;
            }
            else if(a>0 && typed.charAt(b)==name.charAt(a-1))
            {
                b++;
            }
            else
                return false;
        }
        return a==name.length();
    }
}
