import java.util.*;
public class A
{
    /*public static int gcd (int a,int b)
    {
        int gcd = 1; int temp = a;
        while (a%b!= 0)
        {
            temp = a;
            a = b;
            b = temp%b;
        } 
        return b;
    }  */   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        int sol = 0;
        for (int i = 0; i<t; ++i)
        {
            sol = 0;
            int n = Integer.parseInt(sc.next().trim());
            //boolean x[][] = new boolean[n][n];
            for (int j = 1; j<=n; ++j)
            {
                for (int k = 1; k<=3*j && k<=n; ++k)
                {
                    //if (!x[j-1][k-1])
                    {
                        //x[j-1][k-1] = true;
                        if (j == k)
                            ++sol;
                        else
                        {
                            //x[k-1][j-1] = true;
                            if ((j*k)<=(3*gcd(j,k)*gcd(j,k)))
                                sol+=1;
                        }
                    }
                }
            }
            ;
            System.out.println(sol);
        }  
    }
} 
