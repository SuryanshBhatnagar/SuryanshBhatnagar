import java.util.*;
public class B
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        int sol[] = new int[t];
        for (int i = 0; i<t; ++i)
        {
            sol[i] = 0;
            int n = Integer.parseInt(sc.next().trim());
            String s = sc.next().trim();
            int p[] = new int[26];
            for (int j = 0; j<n ; ++j)
            {
                char ch = s.charAt(j);
                p[0 + (ch -'A')]++;
            }
            for (int j = 0; j<26 ; ++j)
            {
                if (p[j]!=0)
                {
                    sol[i] += (p[j]+1);
                }
            }
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}        