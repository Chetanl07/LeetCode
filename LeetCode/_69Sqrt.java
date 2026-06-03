public class _69Sqrt {
    public static void main(String[] args) {
        Solution69 s= new Solution69();
        System.out.println(s.mySqrt(8));
    }
}

class Solution69{
    public int mySqrt(int x) 
    {
        int right=x;
        int left=1;
        int ans=0;

        while (left<=right) 
        {
            int mid=left+(right-left)/2;
            long square=(long) mid*mid;

            if(square==x) return mid;

            if(square<x)
            {
                ans=mid;
                left=mid+1;
            }
            else right =mid-1;
            
        }
       return ans;
    }
}
