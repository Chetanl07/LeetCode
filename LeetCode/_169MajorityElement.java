
import java.util.Arrays;

public class _169MajorityElement {
    public static void main(String []args)
    {
        Solution169 s= new Solution169();
        int[] nums={3,2,3};
        System.out.println(s.majorityElement(nums));
    }
    
}

class Solution169 {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums);

    int value=nums[0];
    int count=0;
   
    for(int i=0;i<nums.length;i++)
    {

      if(value!=nums[i])
      {
        value=nums[i];
        count=1;
      }
      else count++;

      if(count>nums.length/2) return nums[i];
    }

    return 0;
    }
}
