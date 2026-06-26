public class _796RotateString {
    public static void main(String[] args) {
        Solution796 s=new Solution796();
        System.out.println(s.rotateString("abcde", "cdeab"));
    }
}

class Solution796 {
    public boolean rotateString(String s, String goal) {
        

        String concate=s+s;
        if(s.length()!=goal.length())return false;

        return concate.contains(goal);
    }
}
