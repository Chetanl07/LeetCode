public class _3456FindSpecialSubstring {
    public static void main(String[] args) {
        Solution3456 s= new Solution3456();
        System.out.println(s.hasSpecialSubstring("aaabaaa", 3));
    }
}

class Solution3456 {
    public boolean hasSpecialSubstring(String s, int k) {
     for(int i=0;i<=s.length()-k;i++)
     {
        char ch=s.charAt(i);
        boolean same=true;

        for(int j=i; j < i + k;j++)
        {
            if(s.charAt(j)!=ch)
            {
                same=false;
                break;
            }
        }

        if(!same)continue;

        if(i>0 && s.charAt(i-1)==ch) continue;
        if(i+k< s.length() && s.charAt(i+k)==ch) continue;

        return true;
     }
     return false;
    }
}
