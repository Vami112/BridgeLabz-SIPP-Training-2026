import java.util.*;

public class TopKHighestSpendingCustomers {

    public static List<Integer> topKLargest(int[] transactions, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int amount : transactions) {

            if (minHeap.size() < k) {
                minHeap.offer(amount);
            } else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }

        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {

        int[] transactions = {1000, 4500, 2000, 7000, 3000, 6000};
        int k = 3;

        System.out.println(topKLargest(transactions, k));
    }
}