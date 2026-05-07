public class _13RomanToInteger {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}


class Solution {
    public int romanToInt(String s){
       int prev=0,total=0;
       for(int i=s.length()-1;i>=0;i--){
        int current=getValue(s.charAt(i));
        if(current<prev) total-=current;
        else total+=current;
        prev=current;
       }
       return total;        
    }

    public int getValue(char a){
        switch(a){
            case 'I': return 1;
            case 'V': return 5;            
            case 'X': return 10;            
            case 'L': return 50;
            case 'C': return 100;            
            case 'D': return 500;            
            case 'M': return 1000;
            default : return 0;
        }
    }
}


