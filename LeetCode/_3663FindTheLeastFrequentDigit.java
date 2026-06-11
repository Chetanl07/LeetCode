import java.util.Hashtable;
import java.util.Map;


public class _3663FindTheLeastFrequentDigit {
    public static void main(String[] args) {

        Solution3663 s= new Solution3663();
        System.out.println(s.getLeastFrequentDigit(1223655542));
        
    }
    
}


class Solution3663 {
    public int getLeastFrequentDigit(int n) {

         Hashtable<Integer,Integer> ht=new Hashtable<>();

    while(n!=0)
    {
      int digit=n%10;
      ht.put(digit, ht.getOrDefault(digit, 0)+1);
      n/=10;
    }

    int min=10;
    int value=0;
    for(Map.Entry<Integer,Integer> entry : ht.entrySet())
    {

      if(min>=entry.getValue())
      {
        min=entry.getValue();
        value=entry.getKey();
      }
    }

    return value;
    }
}