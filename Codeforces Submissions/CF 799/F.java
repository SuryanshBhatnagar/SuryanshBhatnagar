import java.util.*;
public class F
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		boolean sol[] = new boolean[t];
		for (int i = 0; i<t; ++i)
		{
			sol[i] = false;
			int n = Integer.parseInt(sc.next().trim());
			int a[] = new int[n];
			for (int j = 0; j<n ; ++j)
				a[j] = Integer.parseInt(sc.next());
			for (int j = 0; j<n && !sol[i] ; ++j)
			{
				for (int k = j+1; k<n && !sol[i] ; ++k)
				{
					for (int l = k+1; l<n && !sol[i] ; ++l)
					{
						if ((a[j]+a[k]+a[l])%10 == 3)
							sol[i] = true;
					}
				}
			}
		}
		for (int i = 0; i<t; ++i)
		{
			if (sol[i])
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}
}