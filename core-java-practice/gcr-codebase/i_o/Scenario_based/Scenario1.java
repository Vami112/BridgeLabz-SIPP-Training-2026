import java.io.*;
import java.util.Scanner;

public class Scenario1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));

            String line;
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("reportcard.txt", true)); // append mode

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);

                double average = (m1 + m2 + m3) / 3.0;

                bw.write("Student Name : " + name);
                bw.newLine();
                bw.write("Average Marks : " + average);
                bw.newLine();
                bw.write("----------------------");
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Student file not found.");
        } catch (IOException e) {
            System.out.println("Error while processing file.");
        }
    }
}