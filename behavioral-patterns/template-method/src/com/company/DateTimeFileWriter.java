package com.company;

import java.time.LocalTime;
import java.time.LocalDateTime;

public final class DateTimeFileWriter extends DataFileWriter {

    @Override
    protected String generateText() {
        return LocalDateTime.now().toString() + "\n"  + LocalTime.now().toString();
    }
}
