public class Graph{
    private final int V;
    private final Bag<Integer>[] adj;

    public Graph(int V){
        this.V=V;
        adj= (Bag<Integer>[]) new Bag[V];
        for (int v= 0; v<V; v++)
        adj[v] = new Bag<Integer>();
    }
    //connects the edges of one vertex to the other
    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }
}
