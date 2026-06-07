public class _628MaximumProductOfThree {
    public static void main(String[] args) {
        
        Solution628 s= new Solution628();
        int[] nums={-100,-1,-2,1,2};
        System.out.println(s.maximumProduct(nums));
    }
}

class Solution628 {
    public int maximumProduct(int[] nums) {

       int First=Integer.MIN_VALUE;
   int Second=Integer.MIN_VALUE;
   int Third=Integer.MIN_VALUE;

   int min1=Integer.MAX_VALUE;
   int min2=Integer.MAX_VALUE;

   for(int num:nums)
   {

    if(First<num)
    {
      Third=Second;
      Second=First;
      First=num;
    }
    else if(Second<num)
    {
      Third=Second;
      Second=num;
    }
    else if(Third<num)
    {
      Third=num;
    }


    if(min1>num)
    {
      min2=min1;
      min1=num;
    }
    else if(min2>num)
      min2=num;
   }
   return Integer.max(First*Second*Third, First*min1*min2);

    }
}
