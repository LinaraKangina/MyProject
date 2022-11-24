import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamApp {
    public static void main (String[] args) throws FileNotFoundException {
        String fileName = "C:\\temp\\IO\\1.txt";
        try (InputStream is = new FileInputStream(fileName)){
            while (is.available() != 0) {
                System.out.println(is.read());
            }
        } catch (FileNotFoundException e){
            System.out.println("Не найден файл!");
        }catch (IOException e) {
            System.out.println("Ошибка при считывании данных!");
        }
    }
}
