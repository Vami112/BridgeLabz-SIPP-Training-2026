class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    String stationId;
    double unitsConsumed;

    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill: " + calculateBill());
        System.out.println();
    }
}

public class Question3 {
    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation("S101", 100);
        ChargingStation s2 = new ChargingStation("S102", 120);
        ChargingStation s3 = new ChargingStation("S103", 150);
        ChargingStation s4 = new ChargingStation("S104", 200);
        ChargingStation s5 = new ChargingStation("S105", 180);

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        ChargingStation.electricityRate = 10;

        System.out.println("After Rate Change\n");

        s1.displayStationDetails();
        s2.displayStationDetails();

        System.out.println("Total Stations: " + ChargingStation.totalStations);
    }
}