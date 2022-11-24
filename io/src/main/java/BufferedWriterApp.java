import java.io.*;

public class BufferedWriterApp {
    public static void main (String[] args){
        String outputFileName = "C:\\temp\\IO\\1.txt";

        try (BufferedWriter fileWriter
                     = new BufferedWriter(new FileWriter(outputFileName))){
            String data = "Some data";
            fileWriter.write(data);
        } catch (FileNotFoundException e){
            System.out.println("Не найден файл!");
        }catch (IOException e){
            System.out.println("Ошибка при считывании данных!");
        }
    }
}
