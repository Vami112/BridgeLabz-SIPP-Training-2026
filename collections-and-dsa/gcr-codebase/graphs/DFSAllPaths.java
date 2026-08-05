import java.util.*;

public class DFSAllPaths {

    void allRoutes(Map<Integer, List<Integer>> graph,
                   int current,
                   int target,
                   List<Integer> path,
                   Set<Integer> visited,
                   List<List<Integer>> ans) {

        path.add(current);
        visited.add(current);

        if (current == target) {

            ans.add(new ArrayList<>(path));

        } else {

            for (int next : graph.getOrDefault(current, new ArrayList<>())) {

                if (!visited.contains(next)) {

                    allRoutes(graph, next, target, path, visited, ans);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }
}