import java.util.*;
public class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        String sol[] = new String[t];
        for (int i = 0; i<t; ++i)
        {
            sol[i] = "";
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            int a[] = new int[n];
            String s = "";
            for (int j =0; j<m; ++j)
            {
                s = s + "B";
            }
            for (int j = 0; j<n ; ++j)
            {
                a[j] = Integer.parseInt(sc.next());
                a[j]--;
                char ch1 = s.charAt(a[j]);
                char ch2 = s.charAt(m-a[j]-1);
                if (a[j]<m-a[j])
                {
                    if (ch1 == 'B')
                    {
                        s = s.substring(0,a[j])+"A"+s.substring(a[j]+1);
                    }
                    else if (ch2 == 'B')
                    {
                        s = s.substring(0,m-a[j]-1)+"A"+s.substring(m-a[j]);
                    }
                }
                else 
                {
                    if (ch2 == 'B')
                    {
                        s = s.substring(0,m-a[j]-1)+"A"+s.substring(m-a[j]);
                    }
                    else if (ch1 == 'B')
                    {
                        s = s.substring(0,a[j])+"A"+s.substring(a[j]+1);
                    }
                }
            }
            sol[i] = s;
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
} 
