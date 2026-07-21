import java.util.PriorityQueue;

public class EmergencyRoomTriageQueue {

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    PriorityQueue<Patient> queue = new PriorityQueue<>((a, b) -> b.severity - a.severity);

    void addPatient(Patient p) {
        queue.offer(p);
    }

    Patient treatNext() {
        return queue.poll();
    }

    public static void main(String[] args) {

        EmergencyRoomTriageQueue er = new EmergencyRoomTriageQueue();

        er.addPatient(new Patient("Amit", 3));
        er.addPatient(new Patient("Riya", 8));
        er.addPatient(new Patient("Rahul", 5));

        while (!er.queue.isEmpty()) {
            Patient p = er.treatNext();
            System.out.println(p.name + " " + p.severity);
        }
    }
}