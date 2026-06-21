public class _242ValidAnagram {
    public static void main(String[] args) {
        Solution242 s= new Solution242();
        System.out.println(s.isAnagram("anagram", "nagaram"));
    }   
}

class Solution242 {
    public boolean isAnagram(String s, String t) {
     
     if(s.length()!=t.length()) return false;
     int[] count=new int[26];

     for(int i=0;i<s.length();i++){ 
         count[s.charAt(i)-'a']++;
        count[t.charAt(i)-'a']--;
     }
     for(int freq : count){
        if(freq!=0) return false;
     }
     return true;
    }
}