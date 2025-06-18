package String;

public class WhyWeNeedStringBuilder {
    public static void main(String[] args) {
        String series="";
        for (int i=0;i<26;i++)
        {
            char c=(char)('a'+i);
            series+=c;
        }
        System.out.println(series);
    }
}
