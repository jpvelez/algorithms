public class Merge
{
    private static Comparable[] aux; // Auxiliary array for merges.
    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length]; // Create array just once.
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        StdOut.println("Sort - lo: " + lo + ", hi: " + hi + ", mid: " + mid);
        sort(a, lo, mid);      // Sort right half.
        sort(a, mid+1, hi);  // Sort left half.
        merge(a, lo, mid, hi); // Merge results.
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi)
    {   // Copy a[lo..hi] to aux[lo..hi] - just that section, not every element.
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) { aux[k] = a[k]; }
        // Split aux array, traversing each side and picking smallest int from
        // each. Assumes that both sides of the array are already sorted.
        for (int k = lo; k <= hi; k++)
        {
            if      (i > mid)          { a[k] = aux[j]; j++; }
            else if (j > hi)           { a[k] = aux[i]; i++; }
            else if (less(a[j], a[i])) { a[k] = aux[j]; j++; }
            else                       { a[k] = aux[i]; i++; }
        }
    }

    public static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    public static void printArray(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            if (less(a[i], a[i-1])) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        printArray(a);
    }
}
