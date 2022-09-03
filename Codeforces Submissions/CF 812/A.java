import java.util.*;
public class A
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
            int x[] = new int[n];
            int y[] = new int[n];
            int p,q,r,s;
            p = q = r = s = 0;
            for (int j = 0; j<n; ++j)
            {
                x[j] = Integer.parseInt(sc.next().trim());
                y[j] = Integer.parseInt(sc.next().trim());
                if (x[j]>0) 
                {
                    p = Math.max(p,x[j]);
                }
                if (x[j]<0) 
                {
                    q = Math.min(q,x[j]);
                }                
                if (y[j]>0)
                {
                    r = Math.max(r,y[j]);
                }
                if (y[j]<0)
                {
                    s = Math.min(s,y[j]);
                }                                
            }
            sol = 2*(p-q+r-s);
            System.out.println(sol);
        }  
    }
}         