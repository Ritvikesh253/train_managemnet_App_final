import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== UC1: Initialize Train and Display Consist Summary ===");

        List<String> trainConsist = new ArrayList<>();
        trainConsist.add("Bogie-001");
        trainConsist.add("Bogie-002");
        trainConsist.add("Bogie-003");
        trainConsist.add("Bogie-004");
        trainConsist.add("Bogie-005");

        System.out.println("Train consist initialized with " + trainConsist.size() + " bogies:");
        for (int i = 0; i < trainConsist.size(); i++) {
            System.out.println((i + 1) + ". " + trainConsist.get(i));
        }
    }
}
