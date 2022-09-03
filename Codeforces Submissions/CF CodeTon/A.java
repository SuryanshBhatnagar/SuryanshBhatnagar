import java.util.*;
public class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        String sol = "";
        for (int i = 0; i<t; ++i)
        {
            sol = "NO";
            int n = Integer.parseInt(sc.next().trim()); int m = Integer.parseInt(sc.next().trim());
            String a = sc.next().trim();
            String b = sc.next().trim();
            if (a.endsWith(b.substring(1)))
            {
                if ((a.substring(0,n-m+1)).indexOf(b.charAt(0)) >= 0)
                    sol = "YES";
            }
            sol = sol.trim();
            System.out.println(sol);
        }  
    }
}     