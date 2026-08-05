import java.util.*;

public class NextBusierDay {

    static int[] nextBusierDay(int[] visitors) {
        int n = visitors.length;
        int[] answer = new int[n];

        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() &&
                    visitors[i] > visitors[stack.peek()]) {

                answer[stack.pop()] = visitors[i];
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] visitors = {10, 20, 15, 30, 25};

        int[] result = nextBusierDay(visitors);

        for (int x : result)
            System.out.print(x + " ");
    }
}