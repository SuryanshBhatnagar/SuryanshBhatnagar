import java.util.*;
public class A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        int sol = 0;
        for (int i = 0; i<t; ++i)
        {
            sol = 0; int count = 0;
            char ch1,ch2,ch3,ch4;
            String str1 = sc.next().trim();
            ch1 = str1.charAt(0); ch2 = str1.charAt(1);
            String str2 = sc.next().trim();
            ch3 = str2.charAt(0); ch4 = str2.charAt(1);
            if (!((ch1 == ch2) && (ch1 == ch3) && (ch1 == ch4)))
            {
                if ((ch1 == ch2) || (ch1 == ch3) || (ch1 == ch4) || (ch3 == ch2) || (ch4 == ch3) || (ch2 == ch4))
                {
                    if ((ch1 == ch2))
                    {
                        if (ch3 == ch1 || ch3 == ch4 || ch4 == ch1)
                            sol = 1;
                        else 
                            sol = 2;
                    }
                    else if ((ch1 == ch3))
                    {
                        if (ch2 == ch1 || ch2 == ch4 || ch4 == ch1)
                            sol = 1;
                        else 
                            sol = 2;
                    }
                    else if ((ch1 == ch4))
                    {
                        if (ch2 == ch1 || ch2 == ch3 || ch3 == ch1)
                            sol = 1;
                        else 
                            sol = 2;
                    }
                    else if (ch2 == ch3 && ch2 == ch4)
                    {
                        sol = 1;
                    }
                    else
                    {
                            sol = 2;
                    }
                }
                else 
                {
                    sol = 3;
                }
            }
            System.out.println(sol);
        }  
    }
} 