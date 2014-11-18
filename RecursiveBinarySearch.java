public class RecursiveBinarySearch extends BinarySearch 
{
	public static int rank(int key, int[] a)
	{
		return recursiveRank(key, a, 0, a.length - 1);
	}

	public static int recursiveRank(int key, int[] a, int lo, int hi)
	{	
		if (lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if 		(key < a[mid]) return recursiveRank(key, a, lo, mid - 1);
		else if (key > a[mid]) return recursiveRank(key, a, mid + 1, hi);
		else 				   return mid;
	}
}