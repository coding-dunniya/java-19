import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProgrammingExercises {

    // copy the file from original file to the copied file path
    public static void copyFile(String originalFile, String copiedFile) {
        try (FileInputStream is = new FileInputStream(originalFile); FileOutputStream os = new FileOutputStream(copiedFile)) {
            int read = -1;
            do {
                read = is.read();
                if (read != -1) {
                    os.write(read);
                }
            } while (read != -1);

            os.flush();
            System.out.println("File copied successfully");
        } catch (IOException ex) {
            System.out.println("Exception ==> " + ex.getMessage());
        }
    }

    // method to list the file tree at the specified path
    public static void listFilesTree(String path) {
        walk(path);
    }

    // walk the path
    public static void walk(String path) {
        File root = new File(path);
        File[] files = root.listFiles();
        if (files == null) {
            return;
        }
        for (File f : files) {
            if (f.isFile()) {
                System.out.println("This is a file ==> " + f.getAbsolutePath());
            } else if (f.isDirectory()) {
                walk(f.getAbsolutePath());
                System.out.println("This is a directory ==> " + f.getAbsolutePath());
            }
        }
    }
}
