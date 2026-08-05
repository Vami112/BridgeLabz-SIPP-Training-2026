import java.util.*;

public class ConnectedComponents {

    int countNetworkSegments(Map<Integer, List<Integer>> graph, int n) {

        Set<Integer> visited = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (!visited.contains(i)) {

                count++;
                dfs(graph, i, visited);
            }
        }

        return count;
    }

    void dfs(Map<Integer, List<Integer>> graph,
             int node,
             Set<Integer> visited) {

        visited.add(node);

        for (int next : graph.getOrDefault(node, new ArrayList<>())) {

            if (!visited.contains(next)) {

                dfs(graph, next, visited);
            }
        }
    }
}