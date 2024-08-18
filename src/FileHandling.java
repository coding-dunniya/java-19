import java.io.*;

// simple class to show file reading and writing
public class FileHandling {

    // simple method to read from a file and print to console
    public static void readFile(String filePath) {
        try (InputStream is = new FileInputStream(filePath)) {
            int read = -1;
            do {
                byte[] buffer = new byte[8192];
                read = is.read(buffer);
                if (read != -1) {
                    // we get some data
                    System.out.println("Bytes read from file ==> " + read);
                }
            } while (read != -1);
        } catch (IOException ex) {
            System.out.println("Exception ==> " + ex.getMessage());
        }
    }

    // simple method to write byte array to a file specified by filepath
    public static void writeFile(String filePath, byte[] values) {
        try (OutputStream os = new FileOutputStream(filePath)) {
            os.write(values);
            os.flush();
        } catch (IOException ex) {
            System.out.println("Exception ==> " + ex.getMessage());
        }
    }
}
