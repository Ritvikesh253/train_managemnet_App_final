import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== UC2: Add Passenger Bogies to Train (ArrayList operations) ===");

        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After addition: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After removal of AC Chair: " + passengerBogies);

        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper: " + hasSleeper);
    }
}
