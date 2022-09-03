//RTE on test 2
import java.util.*;
public class E
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        String sol = "";
        for (int i = 0; i<t; ++i)
        {
            sol = "No";
            int n = Integer.parseInt(sc.next().trim());
            int aa[] = new int[n];
            int a[] = new int[n+1];
            for (int jj = 0; jj<n; ++jj)
            {
                aa[jj] = Integer.parseInt(sc.next().trim());
            }
            Arrays.sort(aa); int count = 0; int ct = 0; int ptr = 0; int ctt = 0;
            for (int jj = 0; jj<n; ++jj)
            {
                a[jj] = aa[jj];
            }
            if (n>2)
            {
                a[n] = aa[n-2];
            }            
            for (int j = n-2; j>=0 && ct <= 10 && ctt <=30; --j)
            {
              ctt = 0; 
              while (a[j] != a[j+1]&& ctt<=30 && ct <= 10  && ct <= 10  && ct <= 10 )
              { 
                ++ctt;             
                while (a[j]<a[j+1]&& ctt<=30 && ct <= 10)
                {
                    ++ctt;
                    a[j] = a[j] + (a[j]%10);
                }
                while (a[j+1]<a[j]&& ctt<=30 && ct <= 10 )
                {
                    ++ctt;
                    a[j+1] = a[j+1] + (a[j+1]%10);
                }
              }  
                if (a[j] == a[j+1])
                {
                    ++count;
                }
                else 
                {
                    if (j>ptr)
                        ptr = j;
                }
                if (count == n-1)
                {
                    sol = "Yes";
                    break;
                }
                if (j == 0 && ptr < n && ct <= 10  && ctt <= 30 )
                {
                    ct++;
                    j = ptr;
                    if (ptr == n-1 && n>1)
                        a[n] = a[n-2];
                }
            }
            sol = sol.trim();
            System.out.println(sol);
        }  
    }
}         