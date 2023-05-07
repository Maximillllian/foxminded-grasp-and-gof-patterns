package behavioral_patterns.template_method.src.com.company;

public class Main {

    public static void main(String[] args) {
        DataFileWriter fileWriter = new CurrentDateFileWriter();
        fileWriter.write("./test.txt");
    }
}
