import java.util.Arrays;

class PrintArrayIntersection {

  public static void intersection(int[] a, int[] b)
  {
    Arrays.sort(a);
    Arrays.sort(b);
    int N = a.length;
    int i = 0;
    int j = 0;
    int big = 0;
    int last = 0;
    while ((i < N) && (j < N))
    {
      if (a[i] == b[j]){
        if (last != a[i]) // So you don't print elements that appear in both multiples times.
          StdOut.println(a[i]);
          last = a[i];
        i++;
      } else if (a[i] < b[j]) {
        big = b[j];
        i++;
      } else {
        big = a[i];
        j++;
      }
    }
  }

  public static void main(String[] args)
  {
    int[] a = In.readInts(args[0]);
    int[] b = In.readInts(args[1]);
    intersection(a, b);
  }
}
