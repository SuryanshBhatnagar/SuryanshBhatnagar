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
            int m = Integer.parseInt(sc.next().trim());
            int sx = Integer.parseInt(sc.next().trim());
            int sy = Integer.parseInt(sc.next().trim());
            int d = Integer.parseInt(sc.next().trim());
            int x = 0; int y = 0;
            sol = Math.abs(n-1) + Math.abs(m-1);
            if (((Math.abs(n-sx) + Math.abs(m-sy)) <= d) || (((sy - 1)<=d) && ((m - sy)<=d)) || (((sx - 1)<=d) && ((n - sx)<=d)) || (((n - sx)<=d) && ((m - sy)<=d)) || (((sx - 1)<=d) && ((sy - 1)<=d)))
                sol = -1;
            else if (!((((Math.abs(m-sy) > d))&&((Math.abs(sx-1) > d)))||(((Math.abs(n-sx) > d))&&((Math.abs(sy-1) > d)))))
            {
                /*int a[][] = new int[n][m];
                for (int j = 0; j<n; ++j)
                {
                    for (int k = 0; k<m; ++k)
                    {
                        if ((Math.abs(j+1-sx) + Math.abs(k+1-sy)) <=d)
                            a[j][k] = -1;
                    }
                }*/
            }
            System.out.println(sol);
        }  
    }
} 