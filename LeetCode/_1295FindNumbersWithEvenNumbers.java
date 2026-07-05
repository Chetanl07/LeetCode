public class _1295FindNumbersWithEvenNumbers {
    public static void main(String[] args) {
        Solution1295 sol= new Solution1295();

        int[] array={12,345,2,6,7896};

        System.out.println(sol.findNumbers(array));
    }
}

class Solution1295 {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums)
        {
            int value=0;
            while(num!=0)
            {
                int digit=num%10;
                value++;
                num/=10;
            }
            if(value%2==0) count++;
        }
        return count;
    }
}
