package behavioral_patterns.iterator.src.com.company;

import java.util.Comparator;
import java.util.stream.Collectors;

public class SortedByTitleIterator implements java.util.Iterator<Book> {

    private BookList collection;
    private int currentIndex;

    public SortedByTitleIterator(BookList bookList) {
        collection = (BookList)bookList.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    @Override
    public boolean hasNext() {
        if (currentIndex >= collection.size()) {
            return false;
        }

        currentIndex++;
        return true;
    }

    @Override
    public Book next() {
        return collection.get(currentIndex);
    }
}
