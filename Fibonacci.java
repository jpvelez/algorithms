public class Fibonacci
{
	public static long F(int N)
	{
		if (N==0) return 0;
		if (N==1) return 1;
		return F(N-1) + F(N-2);
	}

	public static void main(String[] args)
	{
		int N = 0;
		while (N < 90)
		{
			StdOut.println(N + " " + F(N));
			N += 1;
		}
	}
}