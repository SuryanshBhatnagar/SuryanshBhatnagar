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
            int n = Integer.parseInt(sc.next().trim());
            String s = sc.next().trim();
            if (n==5)
            {
                if ((s.indexOf('T')>=0)&&(s.indexOf('i')>=0)&&(s.indexOf('m')>=0)&&(s.indexOf('u')>=0)&&(s.indexOf('r')>=0))
                    sol = "YES";
            }
            sol = sol.trim();
            System.out.println(sol);
        }  
    }
} 