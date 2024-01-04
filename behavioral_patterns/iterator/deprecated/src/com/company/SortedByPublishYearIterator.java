package behavioral_patterns.iterator.deprecated.src.com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;

public class SortedByPublishYearIterator implements Iterator<Book> {
    private BookList collection;
    private int currentIndex;

    public SortedByPublishYearIterator(BookList bookList) {
        collection = (BookList)bookList.stream()
                .sorted(Comparator.comparing(Book::getPublishYear))
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
