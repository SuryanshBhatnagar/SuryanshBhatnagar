import java.util.*;
public class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int sol[] = new int[t];
        for (int i = 0; i<t; ++i)
        {
            int a = Integer.parseInt(sc.next().trim());
            int b = Integer.parseInt(sc.next().trim());
            int c = Integer.parseInt(sc.next().trim());
            int d = Integer.parseInt(sc.next().trim());
            if (a*b*c*d == 1)
            {
                sol[i] = 2;
            }
            else if (a+b+c+d != 0)
            {
                sol[i] = 1;
            }
            else
            {
                sol[i] = 0;
            }
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }
    }
}         