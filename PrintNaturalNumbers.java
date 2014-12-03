public class PrintNaturalNumbers
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i < n + 1; i++)
		{	
			StdOut.println(i);
		}
	}
}