import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamBufferApp {
    public static void main (String [] args){
        String fileName = "C:\\temp\\IO\\1.txt";
        try (OutputStream os = new FileOutputStream(fileName)) {
            byte[] buffer = {97, 98, 99};
            os.write(buffer);
        } catch (FileNotFoundException e){//не сработает, так как если файла нет, то создается новый
            System.out.println("Не найден файл!");
        }catch (IOException e) {
            System.out.println("Ошибка при записи в файл!");
        }
    }
}
