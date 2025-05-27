import java.io.FileWriter;
public class FileWriteExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("This is a test string");
            writer.close();
            System.out.println("Data written successfully");
        } catch (Exception e) {
            System.out.println("Error writing file");
        }
    }
}