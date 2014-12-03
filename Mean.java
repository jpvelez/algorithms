public class Mean
{
	public static void main(String[] args)
	{
		// Initialize counters.
		double sum = 0.0;
		int count = 0;
		while(!StdIn.isEmpty())
		{	// Stream through data, summing and incrementing counters.
			sum += StdIn.readDouble();
			count++;
		}
		// Print mean.
		StdOut.println("sum: " + sum + ", count: " + count + ", mean: " + sum / count);
	}
}