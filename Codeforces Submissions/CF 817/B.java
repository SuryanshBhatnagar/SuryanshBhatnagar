import java.util.*;
public class B
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        String sol = "";
        for (int i = 0; i<t; ++i)
        {
            sol = "";
            int n = Integer.parseInt(sc.next().trim());
            String a = sc.next().trim(); String a1 = "";
            String b = sc.next().trim(); String a2 = "";
            for (int j = 0; j<n; ++j)
            {
                char ch1 = a.charAt(j);
                if (ch1 == 'B')
                    a1 = a1 + "" + 'G';
                else 
                    a1 = a1 + "" + ch1;
                char ch2 = b.charAt(j);
                if (ch2 == 'B')
                    a2 = a2 + "" + 'G';
                else 
                    a2 = a2 + "" + ch2;                
            }
            if (a1.equals(a2))
                sol = "YES";
            else 
                sol = "NO";
            sol = sol.trim();
            System.out.println(sol);
        }  
    }
} 