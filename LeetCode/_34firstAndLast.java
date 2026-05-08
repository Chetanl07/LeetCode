import java.util.Arrays;

public class _34firstAndLast
{
    public static void main(String[] args) {

        int nums[]={5,7,7,8,8,4};
        int target=6;

        int arr[]={-1,-1};
        int c=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(c==0)
                {
                    arr[0]=i;
                    c++;
                }
                else if(c==1)
                {
                    arr[1]=i;
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arr));


        
    }
}