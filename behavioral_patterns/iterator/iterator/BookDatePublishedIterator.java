package behavioral_patterns.iterator.iterator;

import behavioral_patterns.iterator.Book;
import behavioral_patterns.iterator.BookCollection;
import behavioral_patterns.iterator.BookIterator;

import java.util.Comparator;

public class BookDatePublishedIterator extends BookIterator {
    public BookDatePublishedIterator(BookCollection books) {
        this.books = books.sortBy(Comparator.comparing(Book::getDatePublished));
    }
}
