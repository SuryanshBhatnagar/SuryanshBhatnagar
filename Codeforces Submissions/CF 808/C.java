/*WRONG*/
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
            int q = Integer.parseInt(sc.next().trim());
            int a[] = new int[n];
            int b[] = new int[n];
            int arr[] = new int[n];
            for (int j = 0; j<n; ++j)
            {
                a[j] = Integer.parseInt(sc.next().trim());
                b[j] = j;
                arr[j] = 0;
            }
            for(int k=0;k<n;++k)
            {
                for(int j=0;j<n-k-1;++j)
                {
                    if(a[j] > a[j+1])
                    {
                        int temp1 = a[j];
                        int temp2 = b[j];
                        a[j] = a[j+1];
                        b[j] = b[j+1];
                        a[j+1] = temp1;
                        b[j+1] = temp2;
                    }
                }
            }
            int jj = 0;
            while (q>0 && jj<n)
            {
                if (b[jj] == n-1)
                {
                    if (q>a[jj])
                    {
                        q = a[jj];
                    }
                }
                if (a[jj] > q)
                    --q;
                ++jj;
            }
            for (int j = 0; j<jj; ++j)
            {
                arr[b[j]] = 1;
            }
            for (int j = 0; j<n; ++j)
            {
                sol[i] = sol[i] + "" + arr[j];
            }                       
            sol[i] = sol[i].trim();            
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}        