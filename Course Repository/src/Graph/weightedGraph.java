package Graph;

import java.util.ArrayList;
import java.util.List;

public class weightedGraph {

    static class Pair{
        int first, second;

        Pair(int a,int b){
            first = a;
            second = b;
        }
    }

    static class Graph{

        int V;
        List<Pair>[] l;


        public Graph(int v){
            V = v;
            l = new ArrayList[V];
            for(int i = 0 ;i < V; i++){
                l[i] = new ArrayList<>();
            }
        }


        void addEdge(int u,int v,int wt,boolean undir){

            l[u].add(new Pair(wt,v));
            if(undir){
                l[v].add(new Pair(wt,u));
            }
        }

    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1,1, true);
        g.addEdge(1,2,2, true);
        g.addEdge(0,2,4, true);
        g.addEdge(0,3,7, true);
        g.addEdge(3,2,2, true);
        g.addEdge(3,4,3, true);

    }
}
