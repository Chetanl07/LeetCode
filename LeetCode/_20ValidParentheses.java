
import java.util.Stack;

public class _20ValidParentheses{
    public static void main(String[] args) {
        Solution20 s= new Solution20();
        boolean value=s.isValid("(){}[]");
        System.out.println(value);
    }
    
}

class Solution20 {
    public boolean isValid(String s) {
        
      Stack<Character> ch = new Stack<>();
        for(char c: s.toCharArray()){
           if(c == '(') ch.push(')');
           else if(c=='{') ch.push('}');
           else if(c== '[')ch.push(']');
           else if(ch.isEmpty() || c!=ch.pop())return false;
        }
        return ch.isEmpty();
    }
}