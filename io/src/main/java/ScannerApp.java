import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerApp {
    public static void main (String[] args){

        String inputFileName = "C:\\temp\\IO\\1.txt";

        try (Scanner scanner = new Scanner(new FileInputStream(inputFileName))){
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
