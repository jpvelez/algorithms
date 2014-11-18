public class RecursiveBinarySearch extends BinarySearch 
{
	public static int rank(int key, int[] a)
	{
		return recursiveRank(key, a, 0, a.length - 1, 0);
	}

	public static int recursiveRank(int key, int[] a, int lo, int hi, int lvl)
	{	
		// Print recursion call arguments.
		StdOut.println(lvl + " lo: " + lo + " hi: " + hi);
		// Keep track of recursion depth.
		lvl += 1; 
		if (lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if 		(key < a[mid]) return recursiveRank(key, a, lo, mid - 1, lvl);
		else if (key > a[mid]) return recursiveRank(key, a, mid + 1, hi, lvl);
		else 				   return mid;
	}
}