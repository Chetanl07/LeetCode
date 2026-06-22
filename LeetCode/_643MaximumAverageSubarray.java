public class _643MaximumAverageSubarray {
    public static void main(String []args)
    {
        Solution643 s= new Solution643();
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(s.findMaxAverage(nums, k));
    }
}

class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        
    double sum=0;
   for(int i=0;i<k;i++)sum+=nums[i];

    double max=sum;
   for(int i=k;i<nums.length;i++) {
     sum=sum-nums[i-k]+nums[i];
     if(sum>max)max=sum;
    }    
    return max/k;     
    }
}
