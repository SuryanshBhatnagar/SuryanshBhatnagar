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
            sol = "YES"; boolean flag = true; int ptr = -1;
            int n = Integer.parseInt(sc.next().trim());
            int a[] = new int[n]; char tone = '0';
            for (int j = 0; j<n; ++j)
            {
                a[j] = Integer.parseInt(sc.next().trim());              
            }
            if (n>1)
            {
                if (a[1]>a[0])
                {
                    tone = '+';
                }
                else if (a[1]<a[0])
                {
                    tone = '-';
                }
                else 
                {
                    ;
                }
            }
            for (int j = 2; j<n-1 && flag; ++j)
            {
                if (tone == '+')
                {
                    if (a[j]<a[j-1])
                    {
                        if (a[j]!=a[j+1])
                        {
                            flag = false;
                            ptr = j;
                        }
                    }
                }
                if (tone == '-')
                {
                    if (a[j]>a[j-1])
                    {
                        if (a[j]!=a[j+1])
                        {
                            flag = false;
                            ptr = j;
                        }
                    }
                }
                if (tone == '0')
                {
                    if (a[j]>a[j-1])
                    {
                        tone = '+';
                    }
                    if (a[j]<a[j-1])
                    {
                        tone = '-';
                    }                                        
                }               
            }
            if (!flag)
                sol = "NO";
            ;
            sol = sol.trim();
            System.out.println(sol);
        }  
    }
} 