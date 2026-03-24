import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== UC6: Map Bogie to Capacity (HashMap) ===");

        Map<String, Integer> bogieCapacity = new HashMap<>();
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 96);
        bogieCapacity.put("First Class", 48);

        System.out.println("Bogie capacities: " + bogieCapacity);
        System.out.println("Sleeper capacity: " + bogieCapacity.get("Sleeper"));
    }
}
