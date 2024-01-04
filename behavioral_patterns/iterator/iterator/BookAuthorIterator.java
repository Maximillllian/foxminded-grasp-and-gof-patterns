package behavioral_patterns.iterator.iterator;

import behavioral_patterns.iterator.Book;
import behavioral_patterns.iterator.BookCollection;
import behavioral_patterns.iterator.BookIterator;

import java.util.ArrayList;
import java.util.Comparator;

public class BookAuthorIterator extends BookIterator {
    public BookAuthorIterator(BookCollection books) {
        this.books = books.sortBy(Comparator.comparing(Book::getAuthor));
    }
}
