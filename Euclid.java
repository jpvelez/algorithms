public class Euclid 
{
	public static int gcd(int p, int q)
	{	
		int r = p % q;
		StdOut.println("p: " + p + ", q: " + q + ", r: " + r);

		if (r == 0) return q;
		return gcd(q, r);
	}

	public static void main(String[] args)
	{
		int p = Integer.parseInt(args[0]);
		int q = Integer.parseInt(args[1]);
		int gcd = gcd(p, q);
		StdOut.println("gcd(" + p + "," + q + ") = " + gcd);
	}
}