import java.util.*;
import java.util.Arrays;
public class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        String sol = "";
        for (int i = 0; i<t; ++i)
        {
            sol = "";
            int n = Integer.parseInt(sc.next().trim());
            int hh = Integer.parseInt(sc.next().trim());
            int mm = Integer.parseInt(sc.next().trim());
            int xx = hh * 60 + mm; int y = 0;
            int h[] = new int[n];
            int m[] = new int[n];
            int x[] = new int[n];
            for (int j = 0; j<n; ++j)
            {
                h[j] = Integer.parseInt(sc.next().trim());
                m[j] = Integer.parseInt(sc.next().trim());
                x[j] = h[j]*60 + m[j];
            }
            Arrays.sort(x); boolean flag = true;
            for (int j = 0; j<n && flag; ++j)
            {
                if (x[j]>=xx)
                {
                    y = x[j] - xx;
                    flag = false;
                }
            }
            if (flag)
            {
                int yx = x[0] + 24*60;
                y = yx - xx;
            }
            int hhh = y/60;
            int mmm = y%60;
            sol = hhh+" "+mmm;
            sol = sol.trim();
            System.out.println(sol);
        }  
    }
}         