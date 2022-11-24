import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterApp {
    public static void main (String[] args){

        String outputFileName = "C:\\temp\\IO\\1.txt";

        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(outputFileName))){
            for (int i = 1; i < 10; i++)
            {
                printWriter.printf("Идентификатор пользователя %d\n", i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
