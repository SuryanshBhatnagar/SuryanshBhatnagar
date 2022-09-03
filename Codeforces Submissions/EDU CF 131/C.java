import java.util.*;
public class C
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int sol[] = new int[t];
        for (int i = 0; i<t; ++i)
        {
            int n = Integer.parseInt(sc.next().trim());
            int m = Integer.parseInt(sc.next().trim());
            int tasks[] = new int[m];
            int workers[] = new int[n];
            for (int j = 0; j<m ; ++j)
            {
                tasks[j] = Integer.parseInt(sc.next().trim());
                tasks[j] = tasks[j]-1;
            }
            for (int j = 0; j<m ; ++j)
            {
                if (tasks[j] < 0)
                    continue;
                int min = workers[0];
                int index = tasks[j];
                for (int k = 1; k<n; ++k)
                {
                    if (min>workers[k])
                    {
                        min = workers[k];
                        index = k;
                    }
                }
                if ((workers[tasks[j]] - workers[index]) > 2)
                {
                    tasks[j] = -1;
                    workers[index] += 2;
                }
                else if ((workers[tasks[j]] - workers[index]) == 2)
                {
                    tasks[j] = -1;
                    workers[index] += 2;
                }
                else
                {
                    workers[tasks[j]] += 1;
                    tasks[j] = -1;
                }
            }
            int max = workers[0];
            for (int k = 1; k<n; ++k)
            {
                if (workers[k]>max)
                    max = workers[k];
            }
            sol[i] = max;
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }
    }
}         