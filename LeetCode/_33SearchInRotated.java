public class _33SearchInRotated
{
    public static void main(String[] args) {

        Solution33 s= new Solution33();
        int[] nums={4,5,6,7,0,1,2};
        System.out.println(s.search(nums, 0));
        
    }
}

class Solution33 {
    public int search(int[] nums, int target) {

        int left=0;
        int right= nums.length-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]==target) return mid;
            if(nums[mid]>=nums[left])
            {
                if(target>=nums[left] && target<nums[mid])
                {
                    right=mid-1;
                }
                else left=mid+1;
            }
            else 
            {
                if(target<=nums[right] && target>nums[mid])
                {
                    left=mid+1;
                }
                else right= mid-1;
            }
        }
        return -1;

    }
}
