import java.io.*;

public class DataIOStreamAPP {
    public static void main (String [] args){
        String outputFileName = "C:\\temp\\IO\\1.txt";
        //String inputFileName = "C:\\temp\\IO\\2.txt";

        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outputFileName)));
             DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(outputFileName)))) {

            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeDouble(1.0);
            dataOutputStream.writeUTF("Hello");
            dataOutputStream.close();

            boolean b = dataInputStream.readBoolean();
            double d = dataInputStream.readDouble();
            String s = dataInputStream.readUTF();

            System.out.println(b);
            System.out.println(d);
            System.out.println(s);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
