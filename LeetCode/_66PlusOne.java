import java.util.Arrays;

public class _66PlusOne {
    public static void main(String[] args) {
        
        int arr[]={1,2,3};

        int n=arr.length;

        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]<9)
            {
                arr[i]++;
                System.out.println(Arrays.toString(arr));
                break;
            }
            arr[i]=0;
        }

        int[] result= new int [n+1];
        result[0]=1;

        System.out.println(Arrays.toString(result));
    }
    
}
