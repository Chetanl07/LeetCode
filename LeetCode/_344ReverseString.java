class _344ReverseString
{
    public static void main(String[] args) {
        Solution344 s= new Solution344();
        char[] ch={'H','e','l','l','o'};
        System.out.println(s.reverseString(ch));

        
    }
}

class Solution344 {
    public char[] reverseString(char[] s) {
        int left=0;
        int right=s.length-1;

        while(left<right)
        {
          char temp= s[left];
          s[left]=s[right];
          s[right]= temp;
          right--;
          left++;
        }

        return s;
    }
}