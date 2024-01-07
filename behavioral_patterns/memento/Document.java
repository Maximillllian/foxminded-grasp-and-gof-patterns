package behavioral_patterns.memento;

import lombok.Data;

import java.time.Instant;

@Data
public class Document {
    private String name;
    private String text;
    private Instant dateCreated;

    public Document(String name, String text) {
        this.name = name;
        this.text = text;
    }
}
