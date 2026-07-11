

public class _1464MaximumProduct {
    public static void main(String[] args) {
        int nums[]={3,4,5,2};

        // MY Logic
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));

        // int a=nums.length;

        // int c= nums[a-1]-1;
        // int b=nums[a-2]-1;

        // System.out.println(c*b);

        
        int max1 = 0, max2 = 0;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        System.out.println((max1 - 1) * (max2 - 1));
    }
}
