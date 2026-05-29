
import java.util.ArrayList;
import java.util.List;

public class _442FindAllDuplicatesInArray {
    public static void main(String[] args) {

        Solution442 s= new Solution442();
        System.out.println(s.findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
        
    }
}
class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicate=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index] <0)
            {
                duplicate.add(index+1);
            }

            nums[index]= nums[index]*-1;
        }

       
        return duplicate;
    }
}