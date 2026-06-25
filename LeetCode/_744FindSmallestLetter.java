public class _744FindSmallestLetter {
    public static void main(String[] args) {
        Solution744 s=new Solution744();
        char[] letters= {'c','f','j'};
        System.out.println(s.nextGreatestLetter(letters, 'a'));
    } 
}

class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {

    for(char ch :letters) {
    if(ch>target)return ch;
   }

   return letters[0];
    
    }
}
