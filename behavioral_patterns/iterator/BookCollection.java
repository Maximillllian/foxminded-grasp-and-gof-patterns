package behavioral_patterns.iterator;

import behavioral_patterns.iterator.iterator.BookAuthorIterator;
import behavioral_patterns.iterator.iterator.BookDatePublishedIterator;
import behavioral_patterns.iterator.iterator.BookNameIterator;
import behavioral_patterns.iterator.iterator.IteratorType;
import lombok.Getter;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@Getter
public class BookCollection implements IterableCollection<Book> {
    private List<Book> books;

    public BookCollection(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> createIterator(IteratorType type) {
        if (type.equals(IteratorType.AUTHOR)) {
            return new BookAuthorIterator(this);
        }

        if (type.equals(IteratorType.NAME)) {
            return new BookNameIterator(this);
        }

        if (type.equals(IteratorType.DATE_PUBLISHED)) {
            return new BookDatePublishedIterator(this);
        }

        return null;
    }

    public List<Book> sortBy(Comparator<Book> comparator) {
        return books.stream().sorted(comparator).toList();
    }
}
