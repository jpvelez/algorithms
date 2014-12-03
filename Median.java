import java.util.Arrays;

public class Median
{
	public static double findMedian(double[] a)
	{
		int N = a.length;
		int mid = (N - 1) / 2;	// Index of middle value.
		if (N % 2 == 0)
		{ // Even number of values.
			return (a[mid] + a[mid + 1]) / 2;	// Take mean of middle values.
		}
		else
		{ // Odd number of values.
			return a[mid];
		}
	}

	public static void main(String[] args)
	{
		In in = new In(args[0]);
		double[] doubles = in.readAllDoubles();	// Breaks on largish datasets.

		Arrays.sort(doubles); // Replace for custom sorting algorithm.
		double median = findMedian(doubles);
		StdOut.println("median: " + median);
	}
}