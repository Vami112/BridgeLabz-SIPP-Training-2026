package interfaces.fitness;

public class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity logged.");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness report generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Health alert sent.");
    }
}