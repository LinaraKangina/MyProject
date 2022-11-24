import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {
    public static void main (String[] args){
        String inputFileName = "C:\\temp\\IO\\1.txt";

        try (BufferedReader fileReader
                     = new BufferedReader(new FileReader(inputFileName))){
            String data = fileReader.readLine();
            System.out.println(data);
        } catch (FileNotFoundException e){
            System.out.println("Не найден файл!");
        }catch (IOException e){
            System.out.println("Ошибка при считывании данных!");
        }
    }
}
