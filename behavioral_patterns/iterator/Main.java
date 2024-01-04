package behavioral_patterns.iterator;

import behavioral_patterns.iterator.iterator.IteratorType;

import java.time.Instant;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var books = new BookCollection(List.of(
            new Book("Max", "Anna Karenina", Instant.ofEpochMilli(1728062667000L)),
            new Book("Anya", "Lotos", Instant.ofEpochMilli(23909067000L)),
            new Book("Ziraf", "Ziraf and Life", Instant.ofEpochMilli(4126353867000L))
        ));

        for (var type : IteratorType.values()) {
            System.out.println("TYPE - " + type.toString());
            var iterator = books.createIterator(type);
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println("---------------------------");
        }
    }
}
