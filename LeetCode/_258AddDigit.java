public class _258AddDigit {
    public static void main(String[] args) {
        Solution258 s= new Solution258();
        System.out.println(s.addDigits(98));
        
    }  
}

class Solution258 {
    public int addDigits(int num) {

        int value=num;
        while(value>9)
        {
            value=digit(value);
        }
        return value;
    }

    public int digit(int value)
    {
        int i=0;
        while(value!=0)
        {
            int digit=value%10;
            value/=10;
            i+=digit;
        }
        return i;
    }
}
