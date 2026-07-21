import java.util.PriorityQueue;

public class AdmissionScoreCutoff {

    public static int findKthLargest(int[] scores, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int score : scores) {

            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] scores = {85, 90, 78, 95, 88, 91};
        int k = 3;

        System.out.println(findKthLargest(scores, k));
    }
}