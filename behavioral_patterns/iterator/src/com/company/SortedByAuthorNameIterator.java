package behavioral_patterns.iterator.src.com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedByAuthorNameIterator implements Iterator<Book> {
    private List<Book> collection;
    private int currentIndex = 0;

    public SortedByAuthorNameIterator(BookList bookList) {
        collection = bookList.stream()
                .sorted(Comparator.comparing(Book::getAuthorName))
                .collect(Collectors.toList());
    }

    @Override
    public boolean hasNext() {
        return currentIndex < collection.size();
    }

    @Override
    public Book next() {
        return collection.get(currentIndex++);
    }
}
