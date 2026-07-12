public class _1486XOROperationInanArray {
    public static void main(String [] args)
    {
        Solution1486 s = new Solution1486();
        System.out.println(s.xorOperation(5,0)
        );

    }
}
class Solution1486 {
    public int xorOperation(int n, int start) {

        int result=start;

    for(int i=1;i<n;i++)
    {
      result^=start+2*i;
    }

    return result;
        
    }
}
