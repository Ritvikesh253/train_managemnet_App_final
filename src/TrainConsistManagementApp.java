import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 * UC7: Sort Bogies by Capacity (Comparator)
 * UC8: Filter Premium Bogies (Lambda + Streams)
 * UC9: Manage Maintenance Queue (Queue)
 * UC10: Undo Last Attachment (Stack via Deque)
 * UC11: Prioritize Dispatch (PriorityQueue)
 * UC12: Maintain Sorted Schedule (TreeMap)
 * UC13: Manage Ends of Consist (Deque)
 * UC14: Generate Analytics Report (Streams + Collectors)
 */
class Bogie {
    private final String id;
    private final String name;
    private final int capacity;
    private final String category;

    public Bogie(String id, String name, int capacity, String category) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + capacity + ", " + category + ")";
    }
}

class DispatchRequest {
    private final String trainNo;
    private final int priority;

    public DispatchRequest(String trainNo, int priority) {
        this.trainNo = trainNo;
        this.priority = priority;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return trainNo + " (priority=" + priority + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC7-UC14) ===");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("BG101", "Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("BG102", "AC Chair", 96, "Premium"));
        bogies.add(new Bogie("BG103", "First Class", 48, "Premium"));
        bogies.add(new Bogie("BG104", "Cargo", 0, "Freight"));
        bogies.add(new Bogie("BG105", "Pantry", 0, "Service"));

        runUC7(bogies);
        runUC8(bogies);
        runUC9();
        runUC10();
        runUC11();
        runUC12();
        runUC13();
        runUC14(bogies);

        System.out.println("Program completed for UC7 to UC14.");
    }

    private static void runUC7(List<Bogie> bogies) {
        System.out.println("--- UC7: Sort Bogies by Capacity (Comparator) ---");
        List<Bogie> sorted = new ArrayList<>(bogies);
        sorted.sort(Comparator.comparingInt(Bogie::getCapacity));
        for (int i = 0; i < sorted.size(); i++) {
            System.out.println((i + 1) + ". " + sorted.get(i));
        }
        System.out.println();
    }

    private static void runUC8(List<Bogie> bogies) {
        System.out.println("--- UC8: Filter Premium Bogies (Lambda + Streams) ---");
        List<Bogie> premium = bogies.stream()
            .filter(b -> "Premium".equalsIgnoreCase(b.getCategory()))
            .collect(Collectors.toList());

        if (premium.isEmpty()) {
            System.out.println("No premium bogies found.");
        } else {
            premium.forEach(System.out::println);
        }
        System.out.println();
    }

    private static void runUC9() {
        System.out.println("--- UC9: Manage Maintenance Queue (Queue) ---");
        Queue<String> maintenanceQueue = new LinkedList<>();
        maintenanceQueue.offer("BG101");
        maintenanceQueue.offer("BG104");
        maintenanceQueue.offer("BG105");

        while (!maintenanceQueue.isEmpty()) {
            System.out.println("Serviced: " + maintenanceQueue.poll());
        }
        System.out.println();
    }

    private static void runUC10() {
        System.out.println("--- UC10: Undo Last Attachment (Stack via Deque) ---");
        Deque<String> attachmentHistory = new ArrayDeque<>();
        attachmentHistory.push("BG201");
        attachmentHistory.push("BG202");
        attachmentHistory.push("BG203");

        System.out.println("Undo attach: " + attachmentHistory.pop());
        System.out.println("Undo attach: " + attachmentHistory.pop());
        System.out.println("Remaining top: " + attachmentHistory.peek());
        System.out.println();
    }

    private static void runUC11() {
        System.out.println("--- UC11: Prioritize Dispatch (PriorityQueue) ---");
        PriorityQueue<DispatchRequest> pq = new PriorityQueue<>(Comparator.comparingInt(DispatchRequest::getPriority));
        pq.offer(new DispatchRequest("TR900", 3));
        pq.offer(new DispatchRequest("TR102", 1));
        pq.offer(new DispatchRequest("TR450", 2));

        while (!pq.isEmpty()) {
            System.out.println("Dispatching: " + pq.poll());
        }
        System.out.println();
    }

    private static void runUC12() {
        System.out.println("--- UC12: Maintain Sorted Schedule (TreeMap) ---");
        Map<String, String> schedule = new TreeMap<>();
        schedule.put("12015", "06:30");
        schedule.put("12759", "09:10");
        schedule.put("12626", "07:45");

        for (Map.Entry<String, String> entry : schedule.entrySet()) {
            System.out.println("Train " + entry.getKey() + " -> Departure " + entry.getValue());
        }
        System.out.println();
    }

    private static void runUC13() {
        System.out.println("--- UC13: Manage Ends of Consist (Deque) ---");
        Deque<String> consist = new ArrayDeque<>();
        consist.addFirst("Engine");
        consist.addLast("Sleeper");
        consist.addLast("AC Chair");
        consist.addLast("Guard");

        System.out.println("Removed front: " + consist.removeFirst());
        System.out.println("Removed rear: " + consist.removeLast());
        System.out.println("Current consist: " + consist);
        System.out.println();
    }

    private static void runUC14(List<Bogie> bogies) {
        System.out.println("--- UC14: Generate Analytics Report (Streams + Collectors) ---");

        long totalBogies = bogies.size();
        int totalCapacity = bogies.stream().mapToInt(Bogie::getCapacity).sum();
        Map<String, Long> categoryCount = bogies.stream()
            .collect(Collectors.groupingBy(Bogie::getCategory, LinkedHashMap::new, Collectors.counting()));

        System.out.println("Total bogies: " + totalBogies);
        System.out.println("Total passenger capacity: " + totalCapacity);
        System.out.println("Category split:");
        for (Map.Entry<String, Long> entry : categoryCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
    }
}
