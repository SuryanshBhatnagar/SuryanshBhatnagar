import java.util.*;
public class D
{
    public static int[] process(String w)
    {
            int A[] = new int[3];
            int cost = 0; int max = w.charAt(0) + 1 - 'a'; int maxindex = 0;
            for (int i = 0; i<w.length(); ++i)
            {
                cost = cost + (w.charAt(i) + 1 - 'a');
                if ((w.charAt(i) + 1 - 'a') > max)
                {
                    max = (w.charAt(i) + 1 - 'a');
                    maxindex = i;
                }
            }
            A[0] = cost;
            A[1] = max;
            A[2] = maxindex;
            return A;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        String sol[] = new String[t];
        for (int i = 0; i<t; ++i)
        {
            String w = sc.next().trim(); 
            int p = Integer.parseInt(sc.next().trim()); int arr[] = process(w);
            int cost = arr[0]; int max = arr[1]; int maxindex = arr[2];
            while (cost>p)
            {
                if (maxindex + 1 < w.length())
                {
                    w = "" + w.substring(0,maxindex) + "" + w.substring(maxindex + 1, w.length()); 
                }
                else 
                {
                    w = "" + w.substring(0,maxindex);
                }
                if(w.length()<1)
                {
                    break;
                }
                else if (w.length()>0)
                {
                arr = process(w);
                cost = arr[0]; max = arr[1]; maxindex = arr[2];
            }}
            sol[i] = w;
        }
        for (int i = 0; i<t; ++i)
        {
            System.out.println(sol[i]);
        }   
    }
}