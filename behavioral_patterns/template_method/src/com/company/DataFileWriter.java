package behavioral_patterns.template_method.src.com.company;

import java.io.FileWriter;
import java.io.IOException;

public abstract class DataFileWriter {
    void write(String filepath) {
        try {
            FileWriter fileWriter = new FileWriter(filepath);
            fileWriter.write(generateText());
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("error occured");
            ex.printStackTrace();
        }
    }

    protected abstract String generateText();
}
