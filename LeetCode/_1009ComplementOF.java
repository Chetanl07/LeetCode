public class _1009ComplementOF
{// Incomplete 
    public static void main(String[] args) {
        int n=5;
        String a="";
        while(n!=0)
        { a+=n%2;
            n/=2;
        }
        int output=0;
        int i=a.length()-1;
        for (char c : a.toCharArray())
        {
            if(c=='0')
               output+=(1<<i);
            i--;
        }
        System.out.println(output);        
  }
}