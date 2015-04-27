public class FixedCapacityStackOfStrings
{ // Use fixed sized string array to represent stack data.
  private String[] a;
  private int N;
  
  FixedCapacityStackOfStrings(int cap)
  {
    a = new String[cap];
  }
  public void push(String s)
  {
    a[N] = s;
    N++;
  }
  public String pop()
  {
    N--;
    return a[N];
  }
  public int length()
  {
    return N;
  }
  public boolean isEmpty()
  {
    return N == 0;
  }
}
