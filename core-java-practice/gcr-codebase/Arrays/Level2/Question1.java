import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] sal = new double[10];
        double[] year = new double[10];
        double[] bonus = new double[10];
        double[] newsal = new double[10];

        double totalBonus = 0;
        double totalOld = 0;
        double totalNew = 0;

        for (int i = 0; i < 10; i++) {
            sal[i] = sc.nextDouble();
            year[i] = sc.nextDouble();

            if (sal[i] <= 0 || year[i] < 0) {
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (year[i] > 5) {
                bonus[i] = sal[i] * 0.05;
            } else {
                bonus[i] = sal[i] * 0.02;
            }

            newsal[i] = sal[i] + bonus[i];

            totalBonus += bonus[i];
            totalOld += sal[i];
            totalNew += newsal[i];
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
    }
}