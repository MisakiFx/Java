import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javafx.scene.shape.Line;

public class FileTest {
    private static final String file = "Func.java";

    public static void main(String[] args) {
        // File file = new File(".");
        // System.out.println(file.exists());
        // System.out.println(file.getAbsolutePath());
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader(file);
            //File outFile = new File("Func.txt");
            //if (!outFile.exists()) {
            //    outFile.createNewFile();
            //}
            writer = new FileWriter("Func.txt");
            int temp;
            while ((temp = reader.read()) != -1) {
                writer.write((char) temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
};