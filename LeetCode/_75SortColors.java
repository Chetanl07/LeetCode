import java.util.Arrays;

public class _75SortColors {
    
    public static void main(String[] args) {
        Solution75 s= new Solution75();
        int[] nums={2,0,1,2,1,0};
        System.out.println(Arrays.toString(s.sortColors(nums)));
    }
}

class Solution75 {

    public void swap(int[] nums,int id1,int id2)
    {
        int temp=nums[id1];
        nums[id1]=nums[id2];
        nums[id2]=temp;
    }
    public int[] sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high)
        {
            if(nums[mid]==2)  swap(nums,mid,high--);
            else if(nums[mid]==0) swap(nums,low++,mid++);
            else mid++;
        }

        return nums;
    }
}
