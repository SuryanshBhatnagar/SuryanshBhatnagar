import java.util.*;
public class C
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String sol[] = new String[t];
        for (int ii = 0; ii<t; ++ii)
        {
            sol[ii] = "";
            String eat = sc.nextLine();
            int n = Integer.parseInt(sc.next().trim());
            int k = Integer.parseInt(sc.next().trim());
            int u[] = new int[n];
            int a[] = new int[k];
            int b[] = new int[k];
            for (int i = 0; i<n; ++i)
            {
                u[i] = Integer.parseInt(sc.next().trim());
            }
            for (int i = 0; i<k; ++i)
            {
                a[i] = Integer.parseInt(sc.next().trim());
                b[i] = Integer.parseInt(sc.next().trim());
                boolean flagA = true; boolean flagB = true;
                int indexA = -1; int indexB = -1;
                for (int j = 0; j<n && flagA ; ++j)
                {
                    if (u[j] == a[i])
                    {
                        indexA = j;
                        flagA = false;
                    }
                }
                if (indexA == -1)
                    sol[ii] += "NO\n";
                else 
                {
                    for (int j = indexA; j<n && flagB; ++j)
                    {
                        if (u[j] == b[i])
                        {
                            indexB = j;
                            flagB = false;
                        }
                    }
                    if (indexB == -1)
                        sol[ii] += "NO\n";
                    else 
                        sol[ii] += "YES\n";     
                }
            }
        }
        for (int ii = 0; ii<t; ++ii)
        {
            System.out.print(sol[ii]);
        }   
    }
}        