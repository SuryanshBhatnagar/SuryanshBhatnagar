import java.util.*;
public class B
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		int sol[] = new int[t];
		for (int i = 0; i<t; ++i)
		{
			int n = Integer.parseInt(sc.next());
			int a[] = new int[n]; a[0] = 0; int j,x;
			for (j = 0, x = 0; j<n && x<n; ++j)
			{
				int temp = Integer.parseInt(sc.next().trim());
				if (x == 0)
					a[x++] = temp;
				else
				{
					boolean flag = true;
					for (int k = 0 ; k<x&&flag ; ++k)
					{
						if (a[k] == temp)
							flag = false;
					}
					if (flag && x<n)
						a[x++] = temp;
				}
			}
			sol[i] = x; x=0;
			if ((n-sol[i])%2!=0)
				sol[i]--;		
		}
		for (int i = 0; i<t; ++i)
		{
			System.out.println(sol[i]);
		}	
	}
}