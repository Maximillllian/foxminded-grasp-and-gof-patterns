package behavioral_patterns.template_method.src.com.company;

import java.time.LocalTime;

public class CurrentTimeFileWriter extends DataFileWriter {
    @Override
    protected String generateText() {
        return LocalTime.now().toString();
    }
}
