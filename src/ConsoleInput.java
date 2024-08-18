import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// simple class to show how to read console input
// contains main method
public class ConsoleInput {

    // main method - jvm calls this method
    public static void main(String[] args) {
        // ping pong program
        // print what user has typed
        // quit program when user type quit
        // use try with resource
        try (InputStreamReader ir = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(ir)) {
            // loop - do while
            String line = null;
            do {
                line = br.readLine();
                if (!"quit".equalsIgnoreCase(line)) {
                    System.out.println("You have typed ==> " + line);
                }
            } while (line != null && !"quit".equalsIgnoreCase(line));
        } catch (IOException ex) {
            System.out.println("IO Exception ==> " + ex.getMessage());
        }
        System.out.println("Program complete");
    }
}
