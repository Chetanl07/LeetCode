import java.util.Arrays;

public class _167TwoSum2 {
    public static void main(String[] args) {
        Solution167 sol=new Solution167();
        int[] numbers={2,7,11,15};

        String x=Arrays.toString(sol.twoSum(numbers, 9));

        System.out.println(x);
    }
}

class Solution167 {
    public int[] twoSum(int[] numbers, int target) {

        int left=0;
        int right=numbers.length-1;

        while(left<right)
        {
            int sum=numbers[right]+numbers[left];

            if(sum == target) return new int[]{left+1,right+1};
            else if(sum<target) left++;
            else right--;
        }
    return new int[]{-1,-1};
    }
}