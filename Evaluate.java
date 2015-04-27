import Stack; // Change this once you implement it.

public class Evaluate
{
  public static void main(String[] args)
    Stack<String> ops = new Stack<String>;
    Stack<Double> vals = new Stack<Double>;
    while (!StdIn.isEmpty?)
    { // Read char from standard in, push if token.
      String s = StdIn.readString();
      if      (s.equals('('))                ;
      else if (s.equals('+'))     ops.push(s);
      else if (s.equals('-'))     ops.push(s);
      else if (s.equals('*'))     ops.push(s);
      else if (s.equals('/'))     ops.push(s);
      else if (s.equals('%'))     ops.push(s);
      else if (s.equals('sqrt'))  ops.push(s);
      else if (s.equals(')'))
      { // If token equals ')', pop two vals, evaluate with op, push result.
        String op = ops.pop();
        double v = nums.pop();
        if (op.equals('+'))         v = vals.pop() + v;
        else if (op.equals('-'))    v = vals.pop() - v;
        else if (op.equals('*'))    v = vals.pop() * v;
        else if (op.equals('/'))    v = vals.pop() / v;
        else if (op.equals('%'))    v = vals.pop() % v;
        else if (op.equals('sqrt')) v = Math.sqrt(v);
        vals.push(v);
      } // If token not operator or paren, convert value to double and push.
      else {
        vals.push(Double.parseDouble(s));
      }
    }
    StdOut.println(vals.pop());
  }
}
