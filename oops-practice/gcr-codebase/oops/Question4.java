class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
}

public class Question4 {

    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\nBikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Vehicle("UP01A1", "Ravi", "Car"),
                new Vehicle("UP01A2", "Priya", "Bike"),
                new Vehicle("UP01A3", "Aman", "Car"),
                new Vehicle("UP01A4", "Neha", "Bike"),
                new Vehicle("UP01A5", "Karan", "Car"),
                new Vehicle("UP01A6", "Simran", "Bike"),
                new Vehicle("UP01A7", "Rohit", "Car"),
                new Vehicle("UP01A8", "Anjali", "Bike"),
                new Vehicle("UP01A9", "Deepak", "Car"),
                new Vehicle("UP01A10", "Pooja", "Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}