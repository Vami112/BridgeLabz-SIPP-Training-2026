import java.util.*;

public class PrintQueue {

    Deque<Integer> queue = new ArrayDeque<>();

    void addLast(int job) {
        queue.addLast(job);
    }

    void addFirst(int job) {
        queue.addFirst(job);
    }

    int removeFirst() {
        return queue.removeFirst();
    }
}