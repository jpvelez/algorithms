public class BreadthFirstPaths
{
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public BreadthFirstPaths(Graph G, int s)
    {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(s);
        marked[s] = true;
        bfs(G, s);
    }

    private void bfs(Graph G, int s)
    {
        Queue<Integer> q = new Queue<Integer>();
        marked[s] = true;
        q.enqueue(s);
        while (!q.isEmpty())
        {
            int v = q.dequeue();
            for (int a: G.adj(v))
            {
                if (!marked[a])
                {
                    marked[a] = true;
                    edgeTo[a] = v;
                    q.enqueue(a);
                }
            }
        }
    }

    public boolean hasPathTo(int v)
    { return marked[v]; }

    public Iterable<Integer> pathTo(int v)
    {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x])
        { path.push(x); }
        path.push(s);
        return path;
    }

    public static void main(String[] args)
    {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        BreadthFirstPaths search = new BreadthFirstPaths(G, s);
        for (int v = 0; v < G.V(); v++)
        {
            StdOut.print(s + " to " + v + ": ");
            if (search.hasPathTo(v))
            {
                for (int x: search.pathTo(v))
                {
                    if (x == s) StdOut.print(x);
                    else        StdOut.print("-" + x);
                }
            }
            StdOut.println();
        }
    }
}
