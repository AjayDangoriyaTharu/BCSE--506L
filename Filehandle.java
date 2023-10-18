import java.io.*;
import java.util.*;

public class Filehandle {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("mile.txt");
            fileWriter.write("I love Coding");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            FileReader fileReader = new FileReader("mile.txt");
            Scanner scan = new Scanner(System.in);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}
