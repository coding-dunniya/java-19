import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// simple class to show how to write text file
public class TextFileHandling {

    // write a simple text file to specified filepath
    public static void writeFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello world");
            writer.write('*');
            writer.write(new char[]{'a', 'b', 'c'});

            writer.flush();
        } catch (IOException ex) {
            System.out.println("Exception ==> " + ex.getMessage());
        }
        System.out.println("File written successfully");
    }

    // read the specified file and print to console
    public static void readFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            int read = -1;
            do {
                read = reader.read();
                if (read != -1) {
                    System.out.print((char) read);
                }
            } while (read != -1);
        } catch (IOException ex) {
            System.out.println("Exception ==> " + ex.getMessage());
        }
    }
}
