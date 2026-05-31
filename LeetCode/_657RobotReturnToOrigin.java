public class _657RobotReturnToOrigin {
    public static void main(String []args)
    {
        String moves="LL";

        int arr[]={0,0};

        for(char c:moves.toCharArray())
        {
            switch(c)
            {
                case 'U' -> arr[0]+=1;

                case 'D' ->arr[0]-=1;

                case 'R' -> arr[1]+=1;

                case 'L' -> arr[1]-=1;
            }
        }

        if(arr[0]==0 && arr[1]==0) System.out.println("Same");
        else System.out.println("Not same");

    }
}
