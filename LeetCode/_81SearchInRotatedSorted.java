public class _81SearchInRotatedSorted {
    public static void main(String[] args) {
        Solution81 s= new Solution81();
        int[] nums={1,0,1,1,1};
        System.out.println(s.search(nums, 0));
        
    }  
}

class Solution81
{
    public boolean search(int[] nums,int target)
    {
        int left=0;
        int right=nums.length-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]==target) return true;

            if(nums[mid]==nums[left] && nums[mid]==nums[right])
            {
                left++; right--;
            }
            else if(nums[mid]<=target)
            {
                if(target>=nums[left] &&  target<nums[mid])
                    right=mid-1;
                else left=mid+1;
            }
            else
            {
                if(target>nums[right] && target>nums[mid])
                {
                    left=mid+1;
                }
                else right=mid-1;
            }
        }
        return false;
    }

}
