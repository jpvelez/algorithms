public class PctNumGtMean {

	public static double findMean(double[] data)
	{
		double sum = 0.0;
		int totalCount = data.length;
		int i = 0;
		while (i < totalCount)
		{
			sum += data[i];
			i += 1;
		}
		return sum / totalCount;
	}

	public static double findPctNumGtMean(double[] data, double mean)
	{
		double gtCount = 0.0;
		double totalCount = data.length;
		for (int i = 0; i < totalCount; i++)
		{
			if (data[i] > mean) gtCount += 1;
		}
		return gtCount / totalCount;
	}

	public static void main(String[] args)
	{
		In in = new In(args[0]);
		double[] data = in.readAllDoubles();
		double mean = findMean(data);
		double pctNumGtMean = findPctNumGtMean(data, mean);
		StdOut.println("Percent of numbers greater than mean " + mean + " = " + pctNumGtMean);
	}
}