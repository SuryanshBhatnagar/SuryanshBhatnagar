import java.util.*;
public class C
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        String sol[] = new String[t];
        for (int i = 0; i<t; ++i)
        {
            sol[i] = "";
            int n = Integer.parseInt(sc.next().trim());
            int a[] = new int[n];
            int b[] = new int[n];
            String m[] = new String[n];
            for (int j = 0; j<n; ++j)
            {
                a[j] = Integer.parseInt(sc.next().trim());
            }
            for (int j = 0; j<n; ++j)
            {
                b[j] = Integer.parseInt(sc.next().trim());
                m[j] = sc.next().trim();
                for (int k = 0; k<b[j]; ++k)
                {
                    char ch = m[j].charAt(k);
                    if (ch == 'U')
                    {
                        if (a[j] == 0)
                            a[j] = 9;
                        else 
                            a[j]--;
                    }
                    if (ch == 'D')
                    {
                        if (a[j] == 9)
                            a[j] = 0;
                        else 
                            a[j]++;
                    }
                }
                sol[i] = sol[i]+""+a[j]+" ";
            }
            sol[i] = sol[i].trim();            
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}        