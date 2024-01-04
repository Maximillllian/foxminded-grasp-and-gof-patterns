package behavioral_patterns.iterator.iterator;

import behavioral_patterns.iterator.Book;
import behavioral_patterns.iterator.BookCollection;
import behavioral_patterns.iterator.BookIterator;

import java.util.Comparator;

public class BookNameIterator extends BookIterator {
//    TODO: придумать, как итерироваться не сортируя и не сохраняя массив
    public BookNameIterator(BookCollection books) {
        this.books = books.sortBy(Comparator.comparing(Book::getName));
    }
}
