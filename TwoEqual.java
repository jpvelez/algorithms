class TwoEqual
{
  public static int count(int[] a)
  {
    int count = 0;
    int N = a.length;
    for (int i = 0; i < N; i++)
    {
      for (int j = i + 1; j < N; j++)
      {
        if (a[i] == a[j]) count++;
      }
    }
    return count;
  }

  public static void main(String[] args)
  {
    int[] a = In.readInts(args[0]);
    int count = count(a);
    StdOut.println("There are " + count + " pairs of numbers that are equal.");
  }
}
