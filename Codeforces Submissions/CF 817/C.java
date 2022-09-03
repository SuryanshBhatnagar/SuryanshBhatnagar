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
            sol = "";
            int n = Integer.parseInt(sc.next().trim());
            String a[] = new String[n]; int aa = 0;
            String b[] = new String[n]; int bb = 0;
            String c[] = new String[n]; int cc = 0;
            int x[][][] = new int[26][26][26];
            for (int j = 0; j<n ; ++j)
            {
                a[j] = sc.next().trim();
                x[a[j].charAt(0)-'a'][a[j].charAt(1)-'a'][a[j].charAt(2)-'a']+=1;
            }
            for (int j = 0; j<n ; ++j)
            {
                b[j] = sc.next().trim();
                x[b[j].charAt(0)-'a'][b[j].charAt(1)-'a'][b[j].charAt(2)-'a']+=7;
            }
            for (int j = 0; j<n ; ++j)
            {
                c[j] = sc.next().trim();
                x[c[j].charAt(0)-'a'][c[j].charAt(1)-'a'][c[j].charAt(2)-'a']+=777;
            }
            for (int j = 0; j<n; ++j)
            {
                if (x[a[j].charAt(0)-'a'][a[j].charAt(1)-'a'][a[j].charAt(2)-'a'] == 1)
                    aa+=3;
                else if (x[a[j].charAt(0)-'a'][a[j].charAt(1)-'a'][a[j].charAt(2)-'a'] == 8 || x[a[j].charAt(0)-'a'][a[j].charAt(1)-'a'][a[j].charAt(2)-'a'] == 778)
                    aa+=1;
                if (x[b[j].charAt(0)-'a'][b[j].charAt(1)-'a'][b[j].charAt(2)-'a'] == 7)
                    bb+=3;
                else if (x[b[j].charAt(0)-'a'][b[j].charAt(1)-'a'][b[j].charAt(2)-'a'] == 8 || x[b[j].charAt(0)-'a'][b[j].charAt(1)-'a'][b[j].charAt(2)-'a'] == 784)
                    bb+=1;
                if (x[c[j].charAt(0)-'a'][c[j].charAt(1)-'a'][c[j].charAt(2)-'a'] == 777)
                    cc+=3;
                else if (x[c[j].charAt(0)-'a'][c[j].charAt(1)-'a'][c[j].charAt(2)-'a'] == 778 || x[c[j].charAt(0)-'a'][c[j].charAt(1)-'a'][c[j].charAt(2)-'a'] == 784)
                    cc+=1;                                    
            }
            /*for (int j = 0; j<n ; ++j)
            {
                boolean ba = b1.contains(a[j]);
                boolean ca = c1.contains(a[j]);
                boolean ab = a1.contains(b[j]);
                boolean cb = c1.contains(b[j]);
                boolean ac = a1.contains(c[j]);
                boolean bc = b1.contains(c[j]);
                if (ba&&ca)
                {
                    aa+=0;
                }
                else if (ba||ca)
                {
                    aa+=1;
                }
                else
                {
                    aa+=3;
                }
                ;
                if (ab&&cb)
                {
                    bb+=0;
                }
                else if (ab||cb)
                {
                    bb+=1;
                }
                else
                {
                    bb+=3;
                }
                ;
                if (bc&&ac)
                {
                    cc+=0;
                }
                else if (bc||ac)
                {
                    cc+=1;
                }
                else
                {
                    cc+=3;
                }
            }*/
            sol = aa+" "+bb+" "+cc;
            sol = sol.trim();
            System.out.println(sol);
        }  
    }
} 