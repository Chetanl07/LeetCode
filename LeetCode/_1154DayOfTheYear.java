public class _1154DayOfTheYear {
    public static void main(String[] args) {
        Solution1154 s= new Solution1154();
        String date="2019-02-10";
        System.out.println(s.dayOfYear(date));
    }
}

class Solution1154 {
    public int dayOfYear(String date) {
        int[] year={31,28,31,30,31,30,31,31,30,31,30,31};

    String[] day=date.split("-");
    int year1=Integer.parseInt(day[0]);
    int month=Integer.parseInt(day[1]);
    int day1=Integer.parseInt(day[2]);


    boolean leap= year1%4==0 && year1%100!=0 || year1%400==0;

    int totalDay=day1;
    
    for(int i=0;i<month-1;i++)
    {
      totalDay+=year[i];
    }
    if(leap && month>2) totalDay++;
    return totalDay;
    }
}


