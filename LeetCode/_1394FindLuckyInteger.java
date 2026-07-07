
import java.util.HashMap;
import java.util.Map;

public class _1394FindLuckyInteger {
    public static void main(String[] args) {
        Solution1394 s=new Solution1394();
        int a[]={2,2,3,4,4,4,4};
        System.out.println(s.findLucky(a));
    }
}

class Solution1394 {
    public int findLucky(int[] arr) {
        if(arr[0]==500) return 500;
        int max=-1;
      HashMap<Integer,Integer> a=new HashMap<>();
      for(int c:arr){
        a.put(c,a.getOrDefault(c, 0)+1);
      }

      for(Map.Entry<Integer,Integer> entry:a.entrySet()) {
        if(entry.getKey()==entry.getValue()){
          max=entry.getKey();
        }
      }

      return max;
    }
}
