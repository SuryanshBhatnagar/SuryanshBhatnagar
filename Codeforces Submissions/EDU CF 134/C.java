import java.util.*;
public class C
{
    public static int[][] sorter(int A[])
    {
        int l = A.length;
        int[][] B = new int[l][2];
        for (int i = 0; i<l; ++i)
        {
            B[i][0] = A[i];
            B[i][1] = i;
        }
        for(int i=0;i<l;++i)
        {
            for(int j=0;j<l-i-1;++j)
            {
                if(B[j][0] > B[j+1][0])
                {
                    int temp1 = B[j+1][0];
                    B[j+1][0] = B[j][0];
                    B[j][0] = temp1;
                    int temp2 = B[j+1][1];
                    B[j+1][1] = B[j][1];
                    B[j][1] = temp2;                    
                }
            }
        }
        return B;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        String sol1 = "";
        String sol2 = "";
        for (int i = 0; i<t; ++i)
        {
            sol1 = ""; sol2 = "";
            int n = Integer.parseInt(sc.next().trim());
            int a[] = new int[n];
            int b[] = new int[n];
            int c[] = new int[n];
            int d1[] = new int[n];
            int d2[] = new int[n];
            for (int j = 0; j<n ; ++j)
            {
                a[j] = Integer.parseInt(sc.next().trim());
            }
            for (int j = 0; j<n ; ++j)
            {
                b[j] = Integer.parseInt(sc.next().trim());
                c[j] = b[j];
            }
            int e[][] = sorter(a);
            Arrays.sort(c);
            for (int j = 0; j<n ; ++j)            
            {
                int tt = 0;
                while (c[tt] < e[j][0])
                {
                   ++tt; 
                }
                d1[e[j][1]] = c[tt] - e[j][0];
                d2[e[j][1]] = c[n-1] - e[j][0];
            }
            for (int j = 0; j<n ; ++j)            
            {
                sol1 = sol1 + d1[j] + " ";
                sol2 = sol2 + d2[j] + " ";
            }
            sol1 = sol1.trim();
            sol2 = sol2.trim();
            System.out.println(sol1);
            System.out.println(sol2);
        }  
    }
}  