import java.io.*;

public class Zadanie1 {
    public static void main (String[] args){
        String inputFileName = "C:\\temp\\IO\\java.png";
        String firstOutputFileName = "C:\\temp\\IO\\java2.png";
        String secondOutputFileName = "C:\\temp\\IO\\copy\\java2.png";
        String thirdOutputFileName = "C:\\temp\\IO\\python.png";

        try (FileInputStream is = new FileInputStream(inputFileName);
             OutputStream fos = new FileOutputStream(firstOutputFileName);
             OutputStream sos = new FileOutputStream(secondOutputFileName);
             OutputStream tos = new FileOutputStream(thirdOutputFileName)) {
            while (is.available() != 0){
                int data = is.read();
                fos.write(data);
                sos.write(data);
                tos.write(data);
            }
        } catch (FileNotFoundException e){//не сработает, так как если файла нет, то создается новый
            System.out.println("Не найден файл!");
        }catch (IOException e) {
            System.out.println("Ошибка при считывании данных!");
        }
    }
}
