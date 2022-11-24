import java.io.*;

public class Zadanie2PostrochnoeCopyrovanie {
    public static void main (String[] args){

        String inputFileName = "C:\\temp\\IO\\1.txt";
        String outputFileName = "C:\\temp\\IO\\2.txt";

        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFileName))){
            while (fileReader.ready()){
                fileWriter.write(fileReader.readLine());
                fileWriter.write("\n");
            }
        }catch (FileNotFoundException e){
            System.out.println("Не найден файл!");
        }catch (IOException e) {
            System.out.println("Ошибка при считывании данных!");
        }

    }
}
