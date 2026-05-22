
// complete but do some work on it

public class _2053KthDIstinct {
    public static void main(String[] args) {
        Solution s=new Solution();
        String []arr={"a","b","a","c","d"};
        System.out.println(s.kthDistinct(arr, 2));
        
    }
    
}

class Solution
{
     public String kthDistinct(String[] arr, int k) {
        
        int a=0;
         for (int i = 0; i < arr.length; i++) {
            boolean v=true;
            

            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[i].equals(arr[j]))
                {
                    v=false;
                    break;
                }
            }
            if(v)
            {
                a++;
                if(a==k)
                 return arr[i];
            }
        }
     return "";

    }
}