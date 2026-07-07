public class InsertionSort {
    public static void main(String[] args) {

        int[] emp = {105, 101, 109, 103, 102};

        for (int i = 1; i < emp.length; i++) {
            int key = emp[i];
            int j = i - 1;

            while (j >= 0 && emp[j] > key) {
                emp[j + 1] = emp[j];
                j--;
            }

            emp[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");

        for (int i : emp) {
            System.out.print(i + " ");
        }
    }
}
