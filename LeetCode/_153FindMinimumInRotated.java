public class _153FindMinimumInRotated {
    public static void main(String[] args) {
        
        Solution153 s= new Solution153();
        int[] nums={3,4,5,1,2};
        System.out.println(s.findMin(nums));
    } 
}

class Solution153 {
    public int findMin(int[] nums) {

        int left=0;
        int right =nums.length-1;

        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(nums[right]<nums[mid]) left=mid+1;
            else right=mid;
        }
      return nums[left];
    }
}
