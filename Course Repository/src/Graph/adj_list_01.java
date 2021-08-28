package Graph;

import java.util.ArrayList;

public class adj_list_01 {


    static class Graph{

        int V;
        ArrayList<ArrayList<Integer>> l;

        Graph(int v){
            V = v;
            l = new ArrayList<>();
            for(int i = 0; i < v; i++){
                l.add(new ArrayList<>());
            }
        }

        void addEdge(int i,int j,boolean undir){
            l.get(i).add(j);
            if(undir){
                l.get(j).add(i);
            }
        }

        void printAdjList(){
            //Iterate over all the rows
            for(int i=0;i<V;i++){
                System.out.print(i + "-->");
                //every element of ith linked list
                for(int node:l.get(i)){
                    System.out.print(node + ", ");
                }
                System.out.println();
            }


        }

    };

    public static void main(String[] args) {

        Graph g = new Graph(6);
        g.addEdge(0,1, true);
        g.addEdge(0,4, true);
        g.addEdge(2,1, true);
        g.addEdge(3,4, true);
        g.addEdge(4,5, true);
        g.addEdge(2,3, true);
        g.addEdge(3,5, true);
        g.printAdjList();

    }

}
