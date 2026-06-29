
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _989AddToArray
{
    public static void main(String[] args)
    {

        int num[]={9,9,9,9,9,9,9,9,9,9};
        int k=1;
        List<Integer> result=new ArrayList<>();
        int i=num.length-1;

        while(i>=0||k>0)
        {
            if(i>=0)
            {
                k+=num[i];
                i--;
            }
            result.add(k%10);
            k/=10;
        }

        Collections.reverse(result);
        System.out.println(result.reversed());








        // Wrong
        // int a=0;

        // for(int i=0;i<num.length;i++)
        // {
        //     a=num[i]+a*10;
        // }
        // int c=a+k;
        // System.out.println();

        // List<Integer> add=new ArrayList<>();
        // while(c!=0)
        // {
        //     add.add(c%10);
        //     c/=10;
        // }

        // System.out.println(add.reversed());

    }
}