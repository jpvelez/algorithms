public class BruteForceBinarySearch extends BinarySearch
{
	public static int rank(int key, int[] a)
	{
		int i = 0;
		while (i < a.length - 1)
		{
			if (a[i] == key) return i;
			i += 1;
		}
		return -1;
	}	
}