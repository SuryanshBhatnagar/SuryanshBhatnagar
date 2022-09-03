import java.util.*;
public class C
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        String sol = "";
        for (int i = 0; i<t; ++i)
        {
            sol = ""; int tt = 9; int x = 0; String y = "";
            int s = Integer.parseInt(sc.next().trim()); x = s;
            if (s<=9)
            {
                sol = s+"";
            }
            else 
            {
                while (x>0)
                {
                    if (x>=tt)
                    {
                        x-=tt;
                        y = tt+""+y;
                        tt--;
                    }
                    else 
                    {
                        y = x+ "" + y;
                        x = 0;
                    }
                }
                sol = y;
            }
            System.out.println(sol);
        }  
    }
}         