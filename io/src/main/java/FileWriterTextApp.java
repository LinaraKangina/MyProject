import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTextApp {

    public static void main (String[] args){
        String outputFileName = "C:\\temp\\IO\\1.txt";

        try (FileWriter fileWriter = new FileWriter (outputFileName)){
            String data = "Привет, world";
            fileWriter.write(data);
        } catch (FileNotFoundException e){
            System.out.println("Не найден файл!");
        }catch (IOException e){
            System.out.println("Ошибка при считывании данных!");
        }
    }
}
