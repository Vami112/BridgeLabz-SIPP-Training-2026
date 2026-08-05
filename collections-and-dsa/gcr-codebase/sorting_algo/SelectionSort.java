public class SelectionSort {
    public static void main(String[] args) {

        int[] score = {88, 55, 92, 70, 65};

        for (int i = 0; i < score.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < score.length; j++) {
                if (score[j] < score[min]) {
                    min = j;
                }
            }

            int temp = score[i];
            score[i] = score[min];
            score[min] = temp;
        }

        System.out.println("Sorted Scores:");

        for (int i : score) {
            System.out.print(i + " ");
        }
    }
}
