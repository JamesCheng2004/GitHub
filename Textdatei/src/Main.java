import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileWriter writer;
        File datei = new File("Texteingabe.txt");
        try {
            writer = new FileWriter(datei);
            writer.write("ich bin so cool");
            writer.write(System.getProperty ("line.separator"));

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
