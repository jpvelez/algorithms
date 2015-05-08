public class Insertion
{
    public static void sort(Comparable[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
            {
                exch(a, j, j-1);
            }
        }
    }

    private static void exch(Comparable[] a, int i, int j)
    { Comparable temp = a[i]; a[i] = a[j]; a[j] = temp; }

    private static boolean less(Comparable v, Comparable w) { return v.compareTo(w) < 0; }

    private static boolean isSorted(Comparable[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            if (less(i, i-1)) { return false; }
        }
        return true;
    }

    private static void printArray(Comparable[] a){
        for (int i = 0; i < a.length; i++)
        { StdOut.print(a[i] + " "); }
        StdOut.println();
    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        printArray(a);
    }
}
