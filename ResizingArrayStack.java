import java.util.Iterator;
public class ResizingArrayStack<Item> implements Iterable<Item>
{
  private Item[] a = (Item[]) new Object[1];
  private int N = 0;

  public boolean isEmpty() { return N == 0; }
  public int size()        { return N;      }

  // Make the stack resizable through array copying.
  private void resize(int cap)
  { // Copy the contents of a to a new array, and make it new instance var.
    Item[] temp = (Item[]) new Object[cap];
    for (int i = 0; i < N; i++)
    {
      temp[i] = a[i];
    }
    a = temp;
  }

  public void push(Item item)
  {
    if (N == a.length) resize(a.length*2);
    a[N] = item;
    N++;
  }

  public Item pop()
  {
    N--;
    Item item = a[N];
    a[N] = null; // Avoid loitering.
    if (N > 0 && N == a.length/4) resize(a.length/2);
    return item; // Need to insert null?
  }

  // Make the stack iterable.
  // Iterable parent class expects an iterator() fn.
  public Iterator<Item> iterator()
  { return new ReverseArrayIterator(); }

  private class ReverseArrayIterator implements Iterator<Item>
  {
    private int i = N;
    public boolean hasNext() { return i > 0;  }
    public Item next()       { return a[i--]; }
    public void remove()     {                }
  }
}
