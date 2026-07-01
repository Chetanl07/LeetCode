public class _1232CheckIfitIsAStaraightLine {
    public static void main(String[] args)
    {
        int[][] coordinates={{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};

        Solution1232 sol=new Solution1232();
        System.out.println(sol.checkStraightLine(coordinates));

    }
}

class Solution1232 {
    public boolean checkStraightLine(int[][] coordinates) {

        int x1=coordinates[0][0];
        int y1=coordinates[0][1];

        int x2=coordinates[1][0];
        int y2=coordinates[1][1];

        for(int i=2;i<coordinates.length;i++)
        {
            int x3=coordinates[i][0];
            int y3=coordinates[i][1];

            if((y2-y1)*(x3-x1) != (y3-y1)*(x2-x1)) return false;

        }
        return true;
    }
}
