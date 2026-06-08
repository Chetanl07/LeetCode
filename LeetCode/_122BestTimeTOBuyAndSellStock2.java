public class _122BestTimeTOBuyAndSellStock2 {
    public static void main(String[] args) {
        
        Solution122 s= new Solution122();
        int[] nums={7,1,5,3,6,4};

        System.out.println(s.maxProfit(nums));
    }
    
}
class Solution122 {
    public int maxProfit(int[] prices) {
        
     int sum=0;
    int left=0;
    int right=1;

    while(left<prices.length-1)
    {
      if(prices[left]<prices[right]) 
      {
        sum+=prices[right]-prices[left];
      }

      left++;
      right++;
    }

    return sum;
    }
}
