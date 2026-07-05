public class _1351CountNegativeNumbers {
    
    public static void main(String[] args) {
        Solution1351 s=new Solution1351();
         int [][] grid={{4,3,2,-1},{3,2,-1,-1},{1,1,1,-2},{-1,-1,-2,-3}};


        System.out.println(s.countNegatives(grid));
    }
}

class Solution1351 {
    public int countNegatives(int[][] grid) {
        
         int sum=0;
      for(int[] a:grid){
        for(int i=0;i<a.length;i++){
          if(a[i]<0){
            sum+=a.length-i;
            break;
          }
        }    
    }
    return sum;
    }

}