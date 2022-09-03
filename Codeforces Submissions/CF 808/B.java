/*TLE on test 4*/
import java.util.*;
public class B
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        String sol[] = new String[t];
        for (int i = 0; i<t; ++i)
        {
            sol[i] = ""; boolean flag = true;
            int n = Integer.parseInt(sc.next().trim());
            long a[] = new long[n];
            long l = Long.parseLong(sc.next().trim());
            long r = Long.parseLong(sc.next().trim());
            flag = (l<=r); long p = l;
            if ((p%n != 0) && flag)
            {
                long zz = p+n-(p%n);
                if (zz>r || zz%n!=0)
                    flag = false;                
            }
            for (int j = 0; j<n && flag && p<=r; ++j)
            {
                long tt = j+1;
                p = l;
                if (p%tt != 0 && flag)
                {
                    long x = p%tt;
                    p = p+tt-x;
                    if (p>r || p%tt!=0)
                        flag = false;
                }
                a[j] = p;
                sol[i] = sol[i] + "" + a[j] + " ";
            }
            if (!flag)
                sol[i] = "NO";
            else 
            {
                sol[i] = "YES\n"+sol[i];
            }
            sol[i] = sol[i].trim();            
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}        