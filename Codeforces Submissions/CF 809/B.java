/* TLE & MLE issue was there, tried to fix it, MLE on test 2 */
import java.util.*;
public class B
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        /*String sol[] = new String[t];*/
        String sol = "";
        for (int i = 0; i<t; ++i)
        {
            sol = "";
            int n = Integer.parseInt(sc.next());
            int c[] = new int[n];
            int d[] = new int[n];
            int e[] = new int[n];
            //int f[][] = new int[n][n];
            int ff[] = new int[n];
            for (int j = 0; j<n; ++j)
            {
                c[j] = Integer.parseInt(sc.next());
                c[j]--;
                if (e[c[j]] == 0)
                {
                    ff[c[j]] = j;
                }
                //f[c[j]][e[c[j]]] = j;
                //for (int k = 0; k<=e[c[j]]; ++k)
                //{
                    int temp = j - ff[c[j]];
                    if ((temp%2 == 1) && (d[c[j]]%2 == 0))
                    {
                        d[c[j]]++;
                    }
                    else if ((temp%2 == 0) && (d[c[j]]%2 == 1))
                    {
                        d[c[j]]++;
                    }
                //}
                e[c[j]]++;
            }
            for (int j = 0; j<n; ++j)
            {
                int ans = 0;
                if (e[j] != 0)
                {
                    ans = d[j]+1;
                    /*for(int k = 0; k<=e[c[j]]; ++k)
                    {
                        if (ans<(d[j][k]+1))
                            ans = d[j][k]+1;
                    }*/
                }
                sol = sol + "" + ans + " ";
            }
            sol = sol.trim();
            System.out.println(sol);
        }
        /*for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }*/   
    }
}         