import java.io.FileWriter;
import java.io.IOException;
public class filereder {
     public static void main(String[] args) {
     try {
     FileWriter w = new FileWriter("C:\\Users\\srish\\OneDrive\\Documents\\javafile.txt");
     try {
     w.write("My name is Ajay..!");
     } finally {
     w.close();
     }
     System.out.println("Successfully wrote data to the file.");
     } catch (IOException e) {
     System.out.println("Exception handled: " + e.getMessage());
     }
     }
}
