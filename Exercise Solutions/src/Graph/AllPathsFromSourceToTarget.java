package Graph;

import java.util.ArrayList;

public class AllPathsFromSourceToTarget {

    static void dfs(ArrayList<ArrayList<Integer>> graph, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> path, int src, int dst) {
        path.add(src);
        if(src == dst) {
            result.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }

        for(int node : graph.get(src))
            dfs(graph, result, path, node, dst);
        path.remove(path.size()-1);
    }

    static ArrayList<ArrayList<Integer>> allPathsSourceTarget(ArrayList<ArrayList<Integer>> graph) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        int nodes = graph.size();
        if(nodes == 0)
            return paths;
        dfs(graph, paths, path, 0, nodes - 1);
        return paths;
    }

}
