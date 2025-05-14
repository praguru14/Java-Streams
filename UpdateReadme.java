import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdateReadme {

    private static final String README_FILE = "README.md";
    private static final String ADDED_PREFIX = "Added (";
    private static final String ADDED_SUFFIX = ")";

    public static void main(String[] args) throws IOException {
        File readmeFile = new File(README_FILE);

        if (!readmeFile.exists()) {
            System.out.println("README.md file not found. Skipping update.");
            return;
        }

        String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String entryToCheck = ADDED_PREFIX + today + ADDED_SUFFIX;

        try (BufferedReader reader = new BufferedReader(new FileReader(readmeFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(readmeFile, true))) {
            String line;
            boolean foundTodayEntry = false;
            while ((line = reader.readLine()) != null) {
                writer.write(line + System.lineSeparator());
                if (line.contains(entryToCheck)) {
                    foundTodayEntry = true;
                    break;
                }
            }

            boolean f;
            if (!foundTodayEntry) {
                writer.write(System.lineSeparator() + entryToCheck);

            } else {

            }
        } catch (IOException e) {
            System.out.println("Error updating README.md: " + e.getMessage());
        }
    }
}
