public class _209MinimumSizeSubarraySum {
    public static void main(String[] args) {
        
        Solution209 sol=new Solution209();
        int target=7;
        int nums[]={2,3,1,2,4,3};
        System.out.println(sol.minSubArrayLen(target, nums));
    }
}

class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {

        int minLeg= Integer.MAX_VALUE;
        int left = 0;
        int sum=0;

        for (int right = 0; right < nums.length; right++) {
            sum+=nums[right];

            while(sum>=target)
            {
                minLeg=Math.min(minLeg,right-left+1);

                sum-=nums[left];
                left++;
            }
        }
        return minLeg==Integer.MAX_VALUE ? 0 : minLeg;
    }
}
