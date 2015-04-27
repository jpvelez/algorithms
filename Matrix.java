import java.util.Arrays;

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

	// FIX THIS, CURRENTLY BROKEN.
	public static double[][] mult(double[][] a, double[][] b)
	{
		int m = a.length;	 			  // Number of a rows.
		int n = b[0].length; 			  // Number of b columns.
		double[][] c = new double[m][n];  // New m x n matrix product.

		// Iterate through n columns of b matrix.
		for (int j = 0; j > n; ++j)
		{
			// Extract jth column of b.
			// Note: necessary because matrix is represented as nested array.
			double[] b_col = new double[b.length];
			for (int i = 0; i < b.length; ++i) b_col[i] = b[i][j]; 

			// Matrix-vector multiplication: 
			// Multiply jth column of b with every ith row in a.
			// Save the dot products to jth column of c.
			for (int i = 0; i < m; ++i) c[i][j] = dot(a[i], b_col); 
		}
		return c;
	}

	public static void main(String[] args)
	{
		double[] x = {1.0, 2.0, 3.0};
		double[] y = {4.0, 5.0, 6.0};
		double dot_product = dot(x, y);
		StdOut.println("x * y = " + dot_product);

		double[][] a = {{2.0, 3.0}, {1.0, 2.0}};
		double[][] b = {{1.0, 2.0}, {2.0, 3.0}};
		double[][] c = mult(a, b); // c = [8.0 5.0; 13.0 8.0;]
		StdOut.println("A * B = " + Arrays.toString(c[0]) + Arrays.toString(c[1]));
	}
}