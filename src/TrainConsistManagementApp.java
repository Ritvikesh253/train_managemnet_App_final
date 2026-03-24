import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== UC4: Maintain Ordered Bogie IDs (LinkedList) ===");

        LinkedList<String> trainConsist = new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");

        System.out.println("Initial consist: " + trainConsist);

        trainConsist.add(1, "Pantry Car");
        System.out.println("After insertion: " + trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removals: " + trainConsist);
    }
}
