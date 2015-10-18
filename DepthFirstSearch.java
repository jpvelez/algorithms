class DepthFirstSearch {
    private boolean[] marked; // Initialize to False?
    private int count;

    public DepthFirstSearch(Graph G, int s)
    {
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    private void dfs(Graph G, int v)
    {
        count++;
        marked[v] = true;
        for (int a: G.adj(v))
        { if (!marked[a]) dfs(G, a); }
    }

    public boolean marked(int v)
    { return marked[v]; }

    public static void main(String[] args)
    {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        DepthFirstSearch search = new DepthFirstSearch(G, s);
        for (int v = 0; v < G.V(); v++){
            if (search.marked[v]) StdOut.print(v + " ");
        }

        StdOut.println();
        if (search.count != G.V()) StdOut.println("NOT connected");
        else                         StdOut.println("connected");
    }
}
