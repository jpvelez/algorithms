import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>
{
    private class Node
    {
        Item item;
        Node next;
    }

    private Node first;
    private int N;

    public void push(Item val)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = val;
        first.next = oldfirst;
        N++;
    }

    public Item pop()
    {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public int size() { return N; }
    public boolean isEmpty() { return N == 0; }

    public Iterator<Item> iterator() { return new ListIterator(); }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;

        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public boolean hasNext() { return current != null; }

        public void remove() { };
    }

    public static void main(String[] args)
    {
        Stack<String> s = new Stack<String>();
        while(!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
        StdOut.println("Stack has " + s.size() + " items left.");
    }
}
