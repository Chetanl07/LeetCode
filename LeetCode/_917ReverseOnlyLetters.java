public class _917ReverseOnlyLetters {
    public static void main(String[] args) {

        Solution917 s= new Solution917();
        String ch="a-bC-dEf-ghIj";
        System.out.println(s.reverseOnlyLetters(ch));
    }
}

class Solution917 {
    public String reverseOnlyLetters(String s) {
        
        char[] ch=s.toCharArray();

   int left=0;
   int right=ch.length-1;

    while(left<=right)
    {
      if(!(Character.isAlphabetic(ch[left]))) 
      {
        left++;
        continue;
      }
      if(!(Character.isAlphabetic(ch[right]))) 
      {
        right--;
        continue;
      }

     
        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
      left++;
      right--;
    }

    return String.valueOf(ch);
    }
}
