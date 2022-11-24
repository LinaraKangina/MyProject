import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamApp {

    public static void main (String [] args){
        String fileName = "C:\\temp\\IO\\1.txt";
        try (OutputStream os = new FileOutputStream(fileName)){
            os.write(110);
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
    }
}
