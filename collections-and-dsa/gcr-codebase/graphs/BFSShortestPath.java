import java.util.*;

public class BFSShortestPath {

    List<Integer> fewestFlights(Map<Integer, List<Integer>> graph, int start, int end) {

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);
        parent.put(start, null);

        while (!queue.isEmpty()) {

            int node = queue.poll();

            if (node == end)
                break;

            for (int next : graph.getOrDefault(node, new ArrayList<>())) {

                if (!visited.contains(next)) {

                    visited.add(next);
                    parent.put(next, node);
                    queue.offer(next);
                }
            }
        }

        if (!visited.contains(end))
            return new ArrayList<>();

        LinkedList<Integer> path = new LinkedList<>();

        Integer curr = end;

        while (curr != null) {

            path.addFirst(curr);
            curr = parent.get(curr);
        }

        return path;
    }
}