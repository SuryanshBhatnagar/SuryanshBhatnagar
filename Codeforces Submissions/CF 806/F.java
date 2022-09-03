import java.util.*;
public class F
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        long sol[] = new long[t];
        for (int i = 0; i<t; ++i)
        {
            int n = Integer.parseInt(sc.next().trim());
            long a[][] = new long[n][2];
            int index = 0; long count = 0;
            for (int j = 0; j<n; ++j)
            {
                long temp = Long.parseLong(sc.next().trim());
                if(temp <= j)
                {
                    a[index][0] = temp;
                    a[index][1] = j+1;
                    index++;
                }
            }           
            for (int j = 0; j<index; ++j)
            {
                for (int k = j+1; k<index; ++k)
                {
                    if ((a[j][0]<a[k][0]) && (a[j][1]<a[k][0]))
                    {
                        ++count;
                    }
                }
            }
            sol[i] = count;
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}        