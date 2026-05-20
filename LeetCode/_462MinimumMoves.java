
import java.util.Arrays;

public class _462MinimumMoves {
    public static void main(String[] args) {
        Solution462 s=new Solution462();
        int[] nums={1,2,3};
        System.out.println(s.minMoves2(nums));
    }
}


class Solution462 {
    public int minMoves2(int[] nums) {
     Arrays.sort(nums);
     
     int median=nums[nums.length/2];
     int moves=0; 

    for(int num:nums){
        moves += Math.abs(num-median);
    }     
      return moves;
    }
}