import java.util.*;
public class A
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		int sol[] = new int[t];
		for (int i = 0; i<t; ++i)
		{
			int a = Integer.parseInt(sc.next().trim());
			int b = Integer.parseInt(sc.next().trim());
			if (b>a)
				++sol[i];
			int c = Integer.parseInt(sc.next().trim());
			if (c>a)
				++sol[i];			
			int d = Integer.parseInt(sc.next().trim());
			if (d>a)
				++sol[i];			
		}
		for (int i = 0; i<t; ++i)
		{
			System.out.println(sol[i]);
		}	
	}
}