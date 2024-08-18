import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// class for homework code
public class Homework {

    // Write a program to input name of a person and print Welcome <Name>
    public static void printName() {
        System.out.println("Enter your name:");
        try (InputStreamReader ir = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(ir)) {
            String line = br.readLine();
            System.out.println("Welcome, " + line);
        } catch (IOException io) {
            System.out.println("IOException ==> " + io.getMessage());
        }
    }

    // Write a program to ask two numbers from user and print their sum
    public static void add2Numbers() {
        System.out.println("Add two numbers here: Enter any two numbers");
        try (InputStreamReader ir = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(ir)) {
            System.out.println("Enter the first number, decimals are supported");
            String line = br.readLine();
            // convert to double
            double a = Double.valueOf(line);
            System.out.println("Enter the second number, decimals are supported");
            line = br.readLine();
            // convert to double
            double b = Double.valueOf(line);
            System.out.println("Sum of two numbers ==> " + (a + b));
        } catch (IOException io) {
            System.out.println("IOException ==> " + io.getMessage());
        }
    }

    // write a program to print 10,000 * characters in a text file
    public static void printCharacters() {
        String file = "text_file.txt";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append('*');
        }
        String characters = sb.toString();
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(characters);   // write using string
            // now write using loop
            // first add new line
            writer.write('\n');
            for (int i = 0; i < 10000; i++) {
                writer.write('*');
            }
            writer.write('\n');
            // flush
            writer.flush();
        } catch (IOException io) {
            System.out.println("IOException ==> " + io.getMessage());
        }
    }
}
