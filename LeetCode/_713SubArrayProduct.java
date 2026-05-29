public class _713SubArrayProduct {
    public static void main(String[] args) {
        Solution713 s=new Solution713();
        int[] nums={10,5,2,6};
        int k=100;
        System.out.println(s.numSubarrayProductLessThanK(nums, k));
    }
}

class Solution713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
      int count=0,left=0,right=0,product=1;

      while(right<nums.length)
      {
         product*=nums[right];

         while(left<nums.length && product>=k)
         {
            product/=nums[left];
            left++;
         }

         count+=right-left+1;
         right++;
      }

      return count;
    }
}