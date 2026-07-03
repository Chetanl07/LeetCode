import java.util.HashSet;

public class _202HappyNumber {
    public static void main(String[] args)
    {
        Solution202 sol=new Solution202();
        System.out.println(sol.isHappy(19));

    }
}
class Solution202 {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set= new HashSet<>();
        
        while(n!=1 && !set.contains(n))
        {
            int sum=0;
            while(n!=0)
            {
                int digit=n%10;
                sum+=digit*digit;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}
