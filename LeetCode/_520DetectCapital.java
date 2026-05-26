public class _520DetectCapital {
    public static void main(String[] args) {
        
        Solution520 s=new Solution520();

        System.out.println(s.detectCapitalUse("Google"));

    }
}

class Solution520 {
    public boolean detectCapitalUse(String word) {
       int big=0,small=0,first=0;

       for(char ch:word.toCharArray())
       {
        if(ch>='A' && ch<='Z')
        {
            big++;
            if(first==0)first=1;
        }
        else
        {
            small++;
            if(first==0)first=2;
        }
       }

       if(big==0 || small==0 || (first==1 && big==1)) return true;
       return false;
    }
}
/*

  if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())) return true;

        if(Character.isUpperCase(word.charAt(0)) 
            && word.substring(1).equals(word.substring(1).toLowerCase())) return true;

        return false;

*/
