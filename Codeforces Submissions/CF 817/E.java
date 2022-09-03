import java.util.*;
public class E
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        long sol = 0;
        for (int i = 0; i<t; ++i)
        {
            sol = 0;
            int n = Integer.parseInt(sc.next().trim());
            int q = Integer.parseInt(sc.next().trim());
            int h[] = new int[n];
            int w[] = new int[n];
            int hs[] = new int[q];
            int ws[] = new int[q];
            int hb[] = new int[q];
            int wb[] = new int[q];            
            for (int j = 0; j<n; ++j)
            {
                h[j] = Integer.parseInt(sc.next().trim());
                w[j] = Integer.parseInt(sc.next().trim());
            }
            for (int j = 0; j<q; ++j)
            {
                hs[j] = Integer.parseInt(sc.next().trim());
                ws[j] = Integer.parseInt(sc.next().trim());
                hb[j] = Integer.parseInt(sc.next().trim());
                wb[j] = Integer.parseInt(sc.next().trim());
                sol = 0;
                for (int k = 0; k<n; ++k)
                {
                    if (h[k]>hs[j] && w[k]>ws[j] && h[k]<hb[j] && w[k]<wb[j])
                        sol = sol + h[k]*w[k];
                }
                ;
                System.out.println(sol);
            }            
            ;
        }  
    }
} 