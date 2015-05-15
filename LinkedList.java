public class LinkedList<Item>
{
    private class Node
    {
        public Item item;
        public Node next;
    }

    public Node first;

    public void add(Item item)
    {
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
    }

    public void delete(int k)
    {
        if (k == 0){ first = first.next; }
        else {
            int n = 0;
            for (Node x = first; x != null; x = x.next)
            {
                if (n == k - 1) { x.next = x.next.next; }
                n++;
            }
        }
    }

    public void printList()
    {
        for (Node x = first; x != null; x = x.next)
        { StdOut.print(x.item + " "); }
        StdOut.println();
    }

    public static void main(String[] args)
    {
         LinkedList l = new LinkedList();
         while(!StdIn.isEmpty())
         {
             l.add(StdIn.readString());
         }

         StdOut.println("Here's the list before deleting K:");
         l.printList();

         l.delete(Integer.parseInt(args[0]));
         StdOut.println("Here's the list after deleting K:");
         l.printList();

    }
}
