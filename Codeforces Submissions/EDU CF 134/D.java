//After live contest ended
import java.util.*;
public class D
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
            int a[] = new int[n];
            int b[] = new int[n];
            int c = 0;
            for (int j = 0; j<n ; ++j)
            {
                a[j] = Integer.parseInt(sc.next().trim());
            }
            for (int j = 0; j<n ; ++j)
            {
                b[j] = Integer.parseInt(sc.next().trim());
            }
            c = a[0]^b[0];
            for (int j = 0; j<n ; ++j)
            {
                for (int k = 0; k<n ; ++k)
                {
                    int temp = a[j]^b[k];
                    if (temp > c)
                        c = temp;
                }
            }
            sol = c;                                       
            System.out.println(sol);
        }  
    }
} 