public class Shell
{
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        int h = 1;
        while (h < N/3) h = 3*h + 1; // 1, 4, 14, 40, 121..
        while (h >= 1)
        {
            for (int i = h; i < N; i++)
            {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
                { exch(a, j, j-h); }
            }
            h /= 3;
        }
    }

    public static void exch(Comparable[] a, int i, int j)
    {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static boolean less(Comparable n, Comparable m)
    { return n.compareTo(m) < 0; // What's the Comparable method name?
    }

    public static boolean isSorted(Comparable[] a)
    {
        for (int i = 1; i < a.length; i++)
        { if (less(i, i-1)) return false; }
        return true;
    }

    public static void printArray(Comparable[] a)
    {
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
