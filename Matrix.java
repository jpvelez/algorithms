public class Matrix
{
	public static double dot(double[] x, double[] y)
	{	// Vectors must have the same dimensions. 
		// In other words, arrays must have the same length.
		int i = 0;
		double sum = 0.0;
		while (i < x.length)
		{
			sum += x[i] * y[i];
			++i;
		}
		return sum;
	}

	public static void main(String[] args)
	{
		double[] x = {1.0, 2.0, 3.0};
		double[] y = {4.0, 5.0, 6.0};
		double dot_product = dot(x, y);
		StdOut.println("x * y = " + dot_product);
	}
}