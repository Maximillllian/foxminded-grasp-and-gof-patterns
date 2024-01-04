package behavioral_patterns.iterator;

import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@Getter
@ToString
public class Book {
    private String author;
    private String name;
    private Instant datePublished;

    public Book(String author, String name, Instant datePublished) {
        this.author = author;
        this.name = name;
        this.datePublished = datePublished;
    }
}
