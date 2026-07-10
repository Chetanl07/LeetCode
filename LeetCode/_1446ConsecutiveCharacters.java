public class _1446ConsecutiveCharacters {
    public static void main(String[] args) {
        Solution1446 sol=new Solution1446();
         String s = "abbcccddddeeeeedcba";
        System.out.println(sol.maxPower(s));
    }
}
class Solution1446 {
    public int maxPower(String s) {
        
    int max=1;
    int count=1;
    char ch=s.charAt(0);
    for(int i=1;i<s.length();i++)
    {
      char doublicate=s.charAt(i);
      if(ch==doublicate)count++;
      else 
      {ch=doublicate;
        count=1;
      }
      max=Math.max(max, count);
    }
    return max;
    }
}
