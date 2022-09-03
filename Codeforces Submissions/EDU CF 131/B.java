import java.util.*;
public class B
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String sol[] = new String[t];
        for (int i = 0; i<t; ++i)
        {
            int n = Integer.parseInt(sc.next().trim());
            sol[i] = "2\n1"; boolean visited[] = new boolean[n]; visited[0] = true;
            for (int j = 1; j<=n; ++j)
            {
                if (!visited[j-1])
                {
                    sol[i] = sol[i] + " " + j; visited[j-1] = true;
                    int temp = 2*j;
                    while (temp<=n)
                    {
                        sol[i] = sol[i] + " " + temp; visited[temp-1] = true;
                        temp *= 2;
                    }
                }
            }
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}