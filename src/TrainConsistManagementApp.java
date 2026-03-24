import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== UC3: Track Unique Bogie IDs (HashSet) ===");

        Set<String> bogieIDs = new HashSet<>();
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate

        System.out.println("Bogie IDs: " + bogieIDs);
        System.out.println("Total unique bogies: " + bogieIDs.size());
    }
}
