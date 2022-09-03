import java.util.*;
public class B
{
    public static boolean checker (char ch, String w)
    {
        int l = w.length();
        for (int i = 0; i<l ; ++i)
        {
            if (w.charAt(i) == ch)
                return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int sol[] = new int[t];
        for (int i = 0; i<t; ++i)
        {
            String s = sc.next().trim();
            int l = s.length(); int x = 0; String w = ""; char ch = s.charAt(0);
            for (int j = 0; j<l ; )
            {
                w = "";
                while ((w.length()<3 || checker(ch,w)))
                {
                    if(!checker(ch,w))
                        w = w+""+ch;
                    j++;
                    if (j < l)
                        ch = s.charAt(j);
                    else 
                        break;                    
                }
                ++x;
            }
            sol[i] = x;
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}        