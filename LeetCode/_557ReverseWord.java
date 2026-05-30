

public class _557ReverseWord {
    public static void main(String[] args) {

        String s= "Let's take LeetCode contest";
        String a="";

        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            for(int j=s1[i].length()-1;j>=0;j--)
            {
                a+=s1[i].charAt(j);
            }
            a+=" ";
        }

        System.out.println(a);


    }
}
