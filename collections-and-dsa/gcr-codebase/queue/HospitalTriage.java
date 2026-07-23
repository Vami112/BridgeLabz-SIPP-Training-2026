import java.util.*;

class Patient {

    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalTriage {

    PriorityQueue<Patient> pq =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    void admitPatient(Patient p) {
        pq.offer(p);
    }

    Patient callNextPatient() {
        return pq.poll();
    }
}