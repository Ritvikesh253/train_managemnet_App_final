import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class TrainConsistManagementAppTest {

    @Test
    void mainShouldPrintUc7ToUc14Sections() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        try {
            TrainConsistManagementApp.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        String console = output.toString();

        assertTrue(console.contains("UC7: Sort Bogies by Capacity"));
        assertTrue(console.contains("UC8: Filter Premium Bogies"));
        assertTrue(console.contains("UC9: Manage Maintenance Queue"));
        assertTrue(console.contains("UC10: Undo Last Attachment"));
        assertTrue(console.contains("UC11: Prioritize Dispatch"));
        assertTrue(console.contains("UC12: Maintain Sorted Schedule"));
        assertTrue(console.contains("UC13: Manage Ends of Consist"));
        assertTrue(console.contains("UC14: Generate Analytics Report"));
    }
}
