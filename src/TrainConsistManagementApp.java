import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== UC5: Preserve Insertion Order with LinkedHashSet ===");

        Set<String> trainFormation = new LinkedHashSet<>();
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // duplicate

        System.out.println("Train formation order + uniques: " + trainFormation);
        System.out.println("Count: " + trainFormation.size());
    }
}
