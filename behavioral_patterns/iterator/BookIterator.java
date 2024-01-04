package behavioral_patterns.iterator;

import java.util.Iterator;
import java.util.List;

public abstract class BookIterator implements Iterator<Book> {
    protected List<Book> books;
    private int currentPosition = 0;

    @Override
    public boolean hasNext() {
        return currentPosition < books.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            return null;
        }

        var book = books.get(currentPosition);
        currentPosition++;
        return book;
    }
}
