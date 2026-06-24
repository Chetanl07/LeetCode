public class _191NumberOf1Bits {
    public static void main(String[] args) {
        
        Solution191 sol= new Solution191();
        System.out.println(sol.hammingWeight(128));
    }
}

class Solution191{
    public int hammingWeight(int n) {
        int value=0;

        while(n!=0)
        {
            if(n%2==1) value++;
            n/=2;
        }
        return value;
    }
}
