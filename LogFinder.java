import java.lang.Math;

public class LogFinder
{
	/* Compute factorial of a given integer. */
	public static double factorial(int N)
	{
		if (N==1) return 1;
		return N * factorial(N-1);
	}

	/* Approximate natural logarithm of given double. */
	public static double ln(double X)
	{
		int N = 0;
		boolean found_log = false;
		while (!found_log)
		{
			if (Math.exp(N) < X)
			{
				N += 1;
			}
			else found_log = true; 
		}
		return N;
	}

	/* Find the natural log of the factorial of user-provided integers */
	public static void main(String[] args)
	{
		int input = Integer.parseInt(args[0]);
		double output = ln(factorial(input));
		StdOut.println(output - 1 + " <= ln(" + input + "!) <= " + output);
	}

	/* Find integer above which a double is required to represent int! */
	public static void find_overflow_factorial(String[] args)
	{
		int N = 1;
		boolean is_small = true;
		while (is_small) {
			double F = factorial(N);
			if (F < 1000000000.0) {
				StdOut.println(N + "! = " + F);
				N += 1;
			} 
			else is_small = false;
		}
	}
}