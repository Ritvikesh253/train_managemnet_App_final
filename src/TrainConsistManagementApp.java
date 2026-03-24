import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC1
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Bogie-001");
        passengerBogies.add("Bogie-002");
        System.out.println("UC1 bogies: " + passengerBogies);

        // UC2
        passengerBogies.add("AC Chair");
        passengerBogies.remove("Bogie-002");
        System.out.println("UC2 list: " + passengerBogies);

        // UC3
        Set<String> bogieIDs = new HashSet<>();
        bogieIDs.add("BG101"); bogieIDs.add("BG101");
        System.out.println("UC3 set: " + bogieIDs);

        // UC4
        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine"); trainConsist.add("Sleeper");
        System.out.println("UC4 linked list: " + trainConsist);

        // UC5
        Set<String> trainFormation = new LinkedHashSet<>();
        trainFormation.add("Engine"); trainFormation.add("Sleeper"); trainFormation.add("Sleeper");
        System.out.println("UC5 linked hash set: " + trainFormation);

        // UC6
        Map<String, Integer> bogieCapacity = new HashMap<>();
        bogieCapacity.put("Sleeper", 72); bogieCapacity.put("AC Chair", 96);
        System.out.println("UC6 map: " + bogieCapacity);
    }
}
