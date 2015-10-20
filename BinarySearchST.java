public class BinarySearchST<Key extends Comparable<Key>, Value>
{
    private Key[] keys;
    private Value[] values;
    private int N;

    public BinarySearchST(int capacity)
    {
        keys = (Key[]) new Comparable[capacity];
        values = (Value[]) new Object[capacity];
    }

    public int rank(Key k)
    {
        int lo = 0, hi = N - 1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            int comp = k.compareTo(keys[mid]);
            if      (comp > 0) hi = mid + 1;
            else if (comp < 0) lo = mid - 1;
            else return mid;
        }
        return lo;
    }

    public int size()
    { return N; }

    public boolean isEmpty()
    { return N == 0; }

    public void put(Key key, Value val)
    {
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0)
        { values[i] = val; return; }
        for (int j = N; j > i; j--)
        { keys[j] = keys[j - 1]; values[j] = values[j - 1]; }
        keys[i] = key; values[i] = val;
        N++;
    }

    public Value get(Key key)
    {
        if (isEmpty()) return null;
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) return values[i];
        else                                      return null;
    }
}
