public class _704BinarySearch {
    public static void main(String[] args) {
        Solution704 s=new Solution704();
        int[] arr={0,1,2,3,9};
        System.out.println(s.search(arr,9));
    }   
}
class Solution704{

    public int search(int[] nums,int target) {
        int low=0;
        int high=nums.length-1;

        while(low<=high) {
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

}