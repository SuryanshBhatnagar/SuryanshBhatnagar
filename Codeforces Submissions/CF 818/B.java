import java.util.*;
public class B
{
    public static void display(boolean A[][], int n)
    {
        for (int i = 0; i<n ; ++i)
        {
            for (int j = 0; j<n ; ++j)
            {
                if (A[i][j])
                    System.out.print("X");
                else 
                    System.out.print(".");
            }
            System.out.println();
        }          
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next().trim());
        for (int i = 0; i<t; ++i)
        {
            sol = "";
            int n = Integer.parseInt(sc.next().trim());
            boolean A[][] = new boolean[n][n];
            int k = Integer.parseInt(sc.next().trim());
            int r = Integer.parseInt(sc.next().trim());
            int c = Integer.parseInt(sc.next().trim());
            A[r-1][c-1] = true;
            A[c-1][r-1] = true;
            for (int j = 0; j<n ; ++j)
            {
                ;
            }
            ;
        }  
    }
}   