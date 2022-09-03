import java.util.*;
public class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String sol[] = new String[t]; boolean flag = true;
        for (int i = 0; i<t; ++i)
        {
            int n = Integer.parseInt(sc.next().trim());/* flag = true;
            
            for (int a = 0; a<n && flag; ++a)
            {
                for (int b = 0; b<n && flag; ++b)
                {
                    for (int c = 0; c<n && flag; ++c)
                    {
                        if (((a^b)+(b^c)+(a^c)) == n)
                        {
                            flag = false;
                            sol[i] = a+" "+b+" "+c;
                        }
                    }
                }
            }
            if (flag) 
                sol[i] = "-1"; */
            if(n%2 == 0)
               sol[i] = 0+" "+0+" "+(n/2);
           else 
               sol[i] = "-1";
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}