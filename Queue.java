import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>
{
    private Node first;
    private Node last;
    private int N;

    private class Node
    {
        public Item item;
        public Node next;
    }

    public boolean isEmpty() { return first == null; }
    public int size()        { return N; }

    public void enqueue(Item item)
    {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;        // If first item, point first to list head.
        else           oldlast.next = last; // If not, add to end of list tail.
        N++;
    }

    public Item dequeue()
    {
        Item item = first.item;
        first = first.next;
        N--;
        if (isEmpty()) last = null;
        return item;
    }

    public Iterator<Item> iterator()
    { return new ListIterator(); }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        public boolean hasNext() { return current != null; }
        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
        public void remove() { }
    }

    public static void main(String[] args)
    {
        Queue<String> q = new Queue<String>();
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-")) q.enqueue(item);
            else if (!q.isEmpty()) StdOut.print(q.dequeue() + " ");
        }
        StdOut.println("(" + q.size() + " left on queue)");
    }
}
