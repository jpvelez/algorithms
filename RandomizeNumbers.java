import java.util.Arrays;

public class RandomizeNumbers
{
	public static void printArrayStdOut(double[] a)
	{
		for (int i = 0; i < a.length; i++) StdOut.println(a[i]);
	}

	public static void shuffle(double[] data)
	{
		int N = data.length;
		for (int i = 0; i < N; i++)
		{
			int r = i + StdRandom.uniform(N - i);
			double temp = data[i];
			data[i] = data[r];
			data[r] = temp;
		}
	}

	public static void main(String[] args)
	{
		In in = new In(args[0]);
		double[] data = in.readAllDoubles();
		shuffle(data);
		printArrayStdOut(data);
	}
}