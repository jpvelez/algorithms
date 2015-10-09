import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>
{
    private Node first;

    public class Node
    {
        public Item item;
        public Node next;
    }

    public void add(Item x)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = x;
        first.next = oldfirst;
    }

    public class BagIterator implements Iterator<Item>
    {
        private Node x = first;

        public Item next()
        {
            Item item = x.item;
            x = x.next;
            return item;
        }

        public boolean hasNext()
        { return x != null; }
    }

    public Iterator<Item> iterator()
    {
        return new BagIterator();
    }

    public static void main(String[] args)
    {   // Read integers from StdIn.
        Bag<Integer> b = new Bag<Integer>();
        int[] ints = StdIn.readAllInts();

        // Add integers to bag.
        for (int i = 0; i < ints.length; i++)
        { b.add(i); }

        // Iterate through bag, printing out integers.
        StdOut.println("Here are the Integers in your Bag:");
        for (int i : b) { StdOut.println(i); }
    }
}
