import java.util.Arrays;

public class KthSmallestValue
{
	public static double[] shiftArray(double[] a, int i)
	{
		// Starting with next to last value in array, shift values to the right
		// including the value at the current index i. That will make room for
		// the current val to take its place.
		int c = a.length - 2; 
		while (c > i - 1)
		{	
			a[c + 1] = a[c]; // Shift current value to the right.
			c = c - 1; // Deincrement by 1, shifting index c to the left.
		}
		return a;
	}

	public static double[] findSmallestVals(double[] a, double val, int n)
	{
		// If current value belongs in smallest value array, add it to the right
		// spot, shifting larger values to the left if necessary.
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == 0.0)
			{
				a[i] = val;
				return a;
			}
			else if (val < a[i])
			{
				a = shiftArray(a, i); 
				a[i] = val;
				return a;
			}
		}
		return a; 	// Always returns array sorted in ascending order.
	}

	public static void main(String[] args)
	{
		// Find the kth smallest value, for k less than n.
		int k = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		double[] smallestVals = new double[n];
		while(!StdIn.isEmpty())
		{
			smallestVals = findSmallestVals(smallestVals, StdIn.readDouble(), n);
		}
		StdOut.println(n + " smallest values in dataset: " + Arrays.toString(smallestVals));
		StdOut.println(k + "th smallest value: " + smallestVals[k - 1]);
	}
}