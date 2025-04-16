import java.util.*;
import java.time.LocalDate;
class Vehicle {
    String number, owner, type, status;
    LocalDate regDate;

    Vehicle(String number, String owner, String type, String status) {
        this.number = number;
        this.owner = owner;
        this.type = type;
        this.status = status;
        this.regDate = LocalDate.now();
    }

    public String toString() {
        return number + " | " + owner + " | " + type + " | " + status + " | " + regDate;
    }
}
public class TrafficManagementSystem {
    static List<Vehicle> vehicles = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Vehicle 2. View Vehicles 3. Exit");
            int ch = sc.nextInt(); sc.nextLine();
            switch (ch) {
                case 1 -> addVehicle();
                case 2 -> vehicles.forEach(System.out::println);
                case 3 -> { System.out.println("Exiting..."); return; }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void addVehicle() {
        System.out.print("Vehicle No: ");
        String num = sc.nextLine();
        System.out.print("Owner: ");
        String own = sc.nextLine();
        System.out.print("Type: ");
        String type = sc.nextLine();
        System.out.print("Status: ");
        String status = sc.nextLine();
        vehicles.add(new Vehicle(num, own, type, status));
        System.out.println("Vehicle added.");
    }
}
