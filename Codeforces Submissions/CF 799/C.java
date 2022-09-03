import java.util.*;
public class C
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		String sol[] = new String[t];
		for (int i = 0; i<t; ++i)
		{
			String eater = sc.nextLine();
			String calc[] = new String[8];
			for (int j = 0; j<8; ++j)
			{
				calc[j] = sc.nextLine();
			}
			for (int j = 1; j<7; ++j)
			{
				int a[] = occ(calc[j-1]);
				int b[] = occ(calc[j]);
				int c[] = occ(calc[j+1]);
				if (a.length==2 && c.length==2 && b.length==1 && ((a[1]-a[0]) == 2) && ((c[1]-c[0]) == 2))
				{
					sol[i] = (j+1)+" "+(b[0]+1);
					break;
				} 
			}
		}
		for (int i = 0; i<t; ++i)
		{
			System.out.println(sol[i]);
		}
	}
	static int[] occ(String x)
	{
		int l = 0;
		for (int i = 0; i<8; ++i)
			if (x.charAt(i)=='#')
				++l;
		int aa[] = new int[l];	
		for (int i = 0, j = 0; i<8; ++i)
			if (x.charAt(i)=='#')
				aa[j++] = i;
		return aa;
	}
}	
