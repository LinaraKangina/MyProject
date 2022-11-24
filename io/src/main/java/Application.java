import java.io.*;

public class Application {

    public static void main (String[] args){
        String inputFileName = "C:\\temp\\IO\\1.txt";
        String outputFileName = "C:\\temp\\IO\\2.txt";

        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            String data = fileReader.readLine();
            //System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
