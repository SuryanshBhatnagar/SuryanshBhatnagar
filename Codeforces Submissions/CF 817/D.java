import java.util.*;
public class D
{
    public static String reverse (String in)
    {
        String r = "";
        for (int i = 0; i<in.length(); ++i)
            r = "" + in.charAt(i) + r;
        return r;
    }
    public static long adder (String in)
    {
        long r = 0; int l = in.length();
        for (int i = 0; i<l; ++i)
        {
            char ch = in.charAt(i);
            if (ch == 'L')
            {
                r += i;
            }
            else 
            {
                r = r + (l-i-1);
            }
        }
        return r;
    }        
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        String sol = "";
        for (int i = 0; i<t; ++i)
        {
            sol = "";
            int n = Integer.parseInt(sc.next().trim());
            String x = sc.next().trim();
            String y = reverse(x);
            String xx = x;
            String yy = y;
            for (int k = 1; k<=n; ++k)
            {
                if (n!=1)
                {
                    int xl = xx.indexOf('L'); if (xl == -1) {xl = n*n;}
                    int yr = yy.indexOf('R'); if (yr == -1) {yr = n*n;}
                    if (xl == yr && xl+yr == n)
                    {
                        ;
                    }
                    else if (xl<=yr)
                    {
                        if (xl+1 <= n && xl>=0)
                        {
                            xx = xx.substring(0,xl)+"R"+xx.substring(xl+1);
                        }
                        else if (xl>=0)
                            xx = xx.substring(0,xl)+"R";
                        yy = reverse(xx);
                    }
                    else
                    {
                        if (n-yr <= n && n-yr>0)
                        {
                            xx = xx.substring(0,n-yr-1)+"L"+xx.substring(n-yr);
                        }
                        else if (n-yr>0)
                            xx = xx.substring(0,n-yr-1)+"L";
                        yy = reverse(xx);
                    }
                sol = sol + adder(xx) + " ";
                //System.out.println(xx);
               }
               else 
               {
                sol = sol + 0 + " ";
               }
            }
            ;
            sol = sol.trim();
            System.out.println(sol);
        }
    }
} 