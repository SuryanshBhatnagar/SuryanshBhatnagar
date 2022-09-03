import java.util.*;
public class B
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        int sol = 0;
        for (int i = 0; i<t; ++i)
        {
            sol = 0;
            int n = Integer.parseInt(sc.next().trim());
            int a[] = new int[n];
            int b[] = new int[n];
            int count = 0;
            for (int j = 0; j<n; ++j)
            {
                a[j] = Integer.parseInt(sc.next().trim());
                b[a[j]-1]++;
                if (b[a[j]-1]==2)
                    count++;
            }
            if (count != 0)
            {
                for (int j = 0; j<n && count > 0; ++j)
                {
                    sol++;
                    if (b[a[j]-1]==2)
                    {
                        b[a[j]-1]--;
                        count--;
                    }
                    b[a[j]-1]--;
                }
            }
            ;
            System.out.println(sol);
        }  
    }
}         