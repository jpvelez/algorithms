import java.util.Arrays;

class TwoEqualFast
{
  public static int count(int[] a)
  {
    Arrays.sort(a);
    int count = 0;
    int N = a.length;
    for (i = 0; i < N; i++)
    {
      // Equal numbers in a sorted array appear next to each other.
      // Does BinarySearch.rank() and this logic actually only count
      // integers that are equal, without double counting?
      // Think you need something different...
      if (BinarySearch.rank(a[i], a) > i) count++;
    }
  }

  public static void main(String[] args)
  {
    int[] a = In.readInts(args[0]);
    int count = count(a);
    StdOut.println("There are " + count + "pairs of numbers that are equal.");
  }
}
