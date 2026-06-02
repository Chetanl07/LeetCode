
import java.util.HashSet;
import java.util.Set;

public class _217ContainsDuplicate {
    public static void main(String[] args) {
        Solution217 s=new Solution217();
        int[] nums={1,2,3,1};
        System.out.println(s.containsDuplicate(nums));
        
    }
}

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
     
     Set<Integer> set= new HashSet<>();

     for(int i=0;i<nums.length;i++)
     {
        if(!set.add(nums[i]))
        {
            return true;
        }
     }
     return false;
    }
}
