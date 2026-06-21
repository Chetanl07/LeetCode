public class _268MissingNumber {
    public static void main(String[] args) {
        Solution268 s= new Solution268();
        int[] nums={3,0,1};
        System.out.println(s.missingNumber(nums));
    }
    
}


class Solution268 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int actualSum=0;

        for(int i:nums)
        {
            actualSum+=i;
        }

        return sum-actualSum;
    }
}