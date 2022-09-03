import java.util.*;
public class D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		int sol[] = new int[t];
		for (int i = 0; i<t; ++i)
		{
			String time = sc.next();
			int gap = Integer.parseInt(sc.next());
			int hh = Integer.parseInt(time.substring(0,2));
			int mm = Integer.parseInt(time.substring(3,5));
			int x = hh, y = mm;boolean flag = true;
			while (flag || (x != hh || y != mm))
			{
				flag = false;
				String ss = ""+x;
				if (x<10)
					ss = 0+ss;
				ss = ss+":";
				if (y<10)
					ss = ss+"0"+y;
				else 
					ss = ss+""+y;
				if (isPal(ss))
				{
					++sol[i];
				}
				y+=gap;
				x+=y/60;
				x = x%24;
				y = y%60;
			}
		}
		for (int i = 0; i<t; ++i)
		{
			System.out.println(sol[i]);
		}		
	}
	public static boolean isPal (String in)
	{
		String r = "";
		for (int i = 0; i<in.length(); ++i)
			r = "" + in.charAt(i) + r;
		return (in.equals(r));
	}
}
