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
            int x = Integer.parseInt(sc.next().trim());
            int a[] = new int[n];
            for (int j = 0; j<n; ++j)
            {
                a[j] = Integer.parseInt(sc.next().trim());
            }
            ;
            System.out.println(sol);
        }  
    }
}         