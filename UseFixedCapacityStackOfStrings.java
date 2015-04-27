// From Algorithms chapter 1.3.
public class UseFixedCapacityStackOfStrings
{
  public static void main(String[] args)
  {
    FixedCapacityStackOfStrings stack;
    stack = new FixedCapacityStackOfStrings(50); // Stack holds 50 vals max.
    while (!StdIn.isEmpty())
    {
      String s = StdIn.readString();
      if (s.equals("-") && !stack.isEmpty())
      {
        StdOut.println(stack.pop());
      }
      else stack.push(s);
    }
    StdOut.println("There are " + stack.length() + " strings left in the stack.");
  }
}
