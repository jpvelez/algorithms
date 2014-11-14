public class LinearFibonacci 
{
	public static long F(int N)
	{	
		long[] FibSeq = new long[N];
		int i = 0;
		while (i < N) 
		{
			if (i == 0) {
				FibSeq[i] = i;
			} else if (i == 1) {
				FibSeq[i] = i; 
			} else {
				FibSeq[i] = FibSeq[i - 1] + FibSeq[i - 2];
			}
			i += 1;
		}
		return FibSeq[N - 1];
	}

	public static void main(String[] args)
	{
		int N = 0;
		while (N < 90)
		{
			StdOut.println(N + " " + F(N + 1));
			N += 1;
		}
	}
}