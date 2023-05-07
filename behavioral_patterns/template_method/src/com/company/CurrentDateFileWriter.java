package behavioral_patterns.template_method.src.com.company;

import java.time.LocalTime;
import java.time.LocalDateTime;

public final class CurrentDateFileWriter extends DataFileWriter {

    @Override
    protected String generateText() {
        return LocalDateTime.now().toLocalDate().toString();
    }
}
