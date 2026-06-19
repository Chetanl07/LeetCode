public class _168ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Solution168 s=new Solution168();
        System.out.println(s.convertToTitle(28));
    }
}

class Solution168 {
    public String convertToTitle(int columnNumber)
    {
        StringBuilder sb= new StringBuilder();
        while(columnNumber!=0)
        {
            columnNumber--;

            sb.append((char)('A'+columnNumber%26));

            columnNumber/=26;
        }
        
        return sb.reverse().toString();
    }
}
