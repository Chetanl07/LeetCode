public class _1390FourDivisors {
    public static void main(String[] args) {
        int[] nums={21,1,25};
        Solution1390 s=new Solution1390();
        System.out.println(s.sumFourDivisors(nums));
    }
    
}

class Solution1390
{
    public int sumFourDivisors(int[] nums)
    {
        int total=0;

        for(int num:nums)
        {
            int sum=0,count=0;
            for(int i=1;i*i<=num;i++)
            {
                if(num%i==0)
                {
                int d1=i;
                int d2=num/i;

                if(d1==d2){
                    count++;
                    sum+=d1;
                }
                else
                {
                    count+=2;
                    sum+=d1+d2;
                }

                if(count>4)break;

            }
        }
            if(count==4)total+=sum;
        }
        return total;
    }
}