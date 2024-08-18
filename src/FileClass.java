import java.io.File;

// simple class to show how files work in java
// it uses File class from java library
public class FileClass {

    // main method - jvm calls this method
    public static void main(String[] args) {
        // file class
        File f = new File("~/projects/coding-dunniya/java-19/hello/world");
        boolean exists = f.exists();
        if (!exists) {
            System.out.println("Path doesn't exist");
        }
        boolean dir = f.isDirectory();
        if (!exists && !dir) {
            boolean mkdir = f.mkdir();
            if (!mkdir) {
                boolean mkdirs = f.mkdirs();
                if (!mkdirs) {
                    System.out.println("There is some error in my filesystem");
                }
            }
        }
        System.out.println("Program complete");
    }
}
