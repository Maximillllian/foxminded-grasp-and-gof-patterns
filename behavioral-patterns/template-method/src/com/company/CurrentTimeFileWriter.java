package com.company;

import java.time.LocalTime;

public class CurrentTimeFileWriter extends DataFileWriter {
    @Override
    protected String generateText() {
        return LocalTime.now().toString();
    }
}
