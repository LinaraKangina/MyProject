import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {
    public static void main (String[] args){
        String inputFileName = "C:\\temp\\IO\\1.txt";
        try (FileReader fileReader = new FileReader(inputFileName)){
            while (fileReader.ready()){
                System.out.println((char) fileReader.read());
            }
        } catch (FileNotFoundException e){
            System.out.println("Не найден файл!");
        }catch (IOException e){
            System.out.println("Ошибка при считывании данных!");
        }
    }
}
