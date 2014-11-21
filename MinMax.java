public class MinMax
{
	public static double findMin(double num, double min)
	{
		if (num < min) return num;
		else return min;
	}

	public static double findMax(double num, double max)
	{
		if (num > max) return num;
		else return max;
	}

	public static void main(String[] args)
	{
		double first_num = StdIn.readDouble();
		double min = first_num;
		double max = first_num;
		while(!StdIn.isEmpty())
		{
			double num = StdIn.readDouble();
			min = findMin(num, min);
			max = findMax(num, max);
		}
		StdOut.println("min: " + min + ", max: " + max);
	}
}