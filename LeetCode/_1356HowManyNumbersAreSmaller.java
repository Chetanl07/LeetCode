

import java.util.Arrays;

public class _1356HowManyNumbersAreSmaller {
    public static void main(String[] args) {
        Solution1356 sol= new Solution1356();
        int[] nums={8,1,2,2,4};
        System.out.println(  Arrays.toString(sol.smallerNumbersThanCurrent(nums)));
    }
    
}
class Solution1356 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
         int[] result=new int[n];
      for(int i=0;i<n;i++)
      { int count=0;
        for(int j=0;j<n;j++)
        {
          if(nums[i]>nums[j] && i!=j)
          {
            count++;
          } 
        }
        result[i]=count;
      }
      return result;

    }
}
