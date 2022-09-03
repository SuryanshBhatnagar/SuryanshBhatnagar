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
            int m = Integer.parseInt(sc.next().trim());
            String s = Integer.toString(Math.abs(m));
            int l = s.length();
            sol[i] = m - (int)(Math.pow(10,l-1));
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}        