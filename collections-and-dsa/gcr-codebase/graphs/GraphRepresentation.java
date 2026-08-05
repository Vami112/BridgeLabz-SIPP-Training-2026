import java.util.*;

public class GraphRepresentation {

    Map<Integer, Set<Integer>> graph = new HashMap<>();

    void addFriendship(int u, int v) {

        graph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        graph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    boolean isFriend(int u, int v) {

        return graph.getOrDefault(u, new HashSet<>()).contains(v);
    }
}