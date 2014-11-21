public class SumOfSquares
{
	public static void main(String[] args)
	{
		double sos = 0;
		while(!StdIn.isEmpty())
		{
			double num = StdIn.readDouble();
			sos = num * num + sos;
		}
		StdOut.println("sum of squares: " + sos);
	}
}