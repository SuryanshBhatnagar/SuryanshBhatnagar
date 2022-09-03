import java.util.*;
public class D
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
            String s[] = new String[n];
            boolean flag[] = new boolean[n];
            for (int j = 0; j<n; ++j)
            {
                s[j] = (sc.next().trim()).toLowerCase();
                flag[j] = true;
            }
            for (int j = 0; j<n; ++j)
            {
                for (int k = 0; k<n && flag[j]; ++k)
                {
                    if (k == j)
                    {
                        ;
                    }
                    else 
                    {
                        if(s[j].startsWith(s[k]))
                        {
                            for (int q = 0; q<n && flag[j]; ++q)
                            {
                                if (q!=j)
                                {
                                    if (s[j].equalsIgnoreCase(s[k]+""+s[q]))
                                    {
                                        flag[j] = false;
                                    }
                                }
                            }
                        }
                    }
                }
                if (flag[j])
                    sol[i] = sol[i]+"0";
                else 
                    sol[i] = sol[i]+"1";
            }            
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}        