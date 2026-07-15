import java.util.Scanner;

class Question5 {

    static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        System.out.println(convertYardsToFeet(n));
        System.out.println(convertFeetToYards(n));
        System.out.println(convertMetersToInches(n));
        System.out.println(convertInchesToMeters(n));
        System.out.println(convertInchesToCm(n));
    }
}