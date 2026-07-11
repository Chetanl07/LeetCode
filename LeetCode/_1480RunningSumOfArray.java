import java.util.Arrays;

public class _1480RunningSumOfArray
{
    public static void main(String[] args) {
        Solution1480 sol= new Solution1480();
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(sol.runningSum(nums)));
    }
}
class Solution1480 {
    public int[] runningSum(int[] nums) {
		for(int i=1;i<nums.length;i++) {
		nums[i]+=nums[i-1];
		}
		return nums;
    }
}