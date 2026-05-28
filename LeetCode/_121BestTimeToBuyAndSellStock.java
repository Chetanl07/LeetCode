public class _121BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution121 s=new Solution121();
        System.out.println(s.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}

class Solution121 {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++)
        {
            if(minPrice>prices[i]) minPrice=prices[i];

            int profit= prices[i]-minPrice;

            if(profit>maxProfit) maxProfit=profit;
        }
        return maxProfit;
    }
}