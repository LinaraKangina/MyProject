import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {

    public static void main (String[] args){
        String inputFileName = "C:\\temp\\IO\\1.txt";

        try (FileWriter fileWriter = new FileWriter (inputFileName)){
            fileWriter.write("H");
        } catch (FileNotFoundException e){
            System.out.println("Не найден файл!");
        }catch (IOException e){
            System.out.println("Ошибка при считывании данных!");
        }
    }
}
