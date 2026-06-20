public class _171ExcelSheetColumnNumber {
    public static void main(String[] args) {
        Solution171 s= new Solution171();
        System.out.println(s.titleToNumber("AAA"));
    }
}


class Solution171 {
    public int titleToNumber(String columnTitle) {
        int result=0;

        for(int i=0;i<columnTitle.length();i++)
        {
            char ch=columnTitle.charAt(i);
            result=result*26+(ch-'A'+1);
        }
        return result;
    }
}