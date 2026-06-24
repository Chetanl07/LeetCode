public class _345ReverseVowels {
    public static void main(String[] args) {
        Solution345 s= new Solution345();
        System.out.println(s.reverseVowels("IceCreAm"));
    }
}


class Solution345 
{
    public String reverseVowels(String s) {

    char[] ch=s.toCharArray();

    int left=0;
    int right= s.length()-1;

    while(left<right)
    {
      if(check(ch[left]))
      {
        left++;
        continue;
      }
      else if(check(ch[right]))
      {
        right--;
        continue;
      }

      char temp= ch[left];
      ch[left]=ch[right];
      ch[right]=temp;

      left++;
      right--;
    }

    return String.valueOf(ch);
    }


    public boolean check(char ch)
    {
         if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
      ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ))
      {
        return true;

      }

      return false;
    }
  }
