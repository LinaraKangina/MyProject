import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferApp {

    public static void main (String[] args){
        String inputFileName = "C:\\temp\\IO\\1.txt";

        try (FileWriter fileWriter = new FileWriter (inputFileName)){
            char[] buffer = {'H', 'e', 'l', 'l', 'o'};
            fileWriter.write(buffer);
        } catch (FileNotFoundException e){
            System.out.println("Не найден файл!");
        }catch (IOException e){
            System.out.println("Ошибка при считывании данных!");
        }
    }
}
