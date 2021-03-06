import java.util.Arrays;

public class BinarySearch
{
	public static int rank(int key, int[] a)
	{
		// Array must be sorted.
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi)
		{
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return a[mid];
		}
		return -1;
	}

	public static void main(String[] args)
	{
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();
		Arrays.sort(whitelist);

		while (!StdIn.isEmpty())
		{	// Read key, print if not in whitelist.
			int key = StdIn.readInt();
			if (rank(key, whitelist) == -1)
			{	// User specifies whether to print keys on whitelist or off.
				if (args[1].equals("-")) StdOut.println(key);
			}
			else
			{
				if (args[1].equals("+")) StdOut.println(key);
			}
		}
	}
}