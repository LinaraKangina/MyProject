import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamBufferApp {
    public static void main(String[] args) {
        String fileName = "C:\\temp\\IO\\1.txt";
        try (InputStream is = new FileInputStream(fileName)) {
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            for (byte el : buffer){
                System.out.println((char) el);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл!");
        } catch (IOException e) {
            System.out.println("Ошибка при считывании данных!");
        }
    }
}