package behavioral_patterns.iterator.deprecated.src.com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList extends ArrayList<Book> {

    private SortField sortField = SortField.TITLE;
    private List<Book> books = new ArrayList<>();

    @Override
    public Iterator<Book> iterator() {
        return switch (this.sortField) {
            case TITLE -> new SortedByTitleIterator(this);
            case AUTHOR_NAME -> new SortedByAuthorNameIterator(this);
            case PUBLISH_YEAR -> new SortedByPublishYearIterator(this);
            default -> throw new IllegalArgumentException();
        };
    }

    public void sortBy(SortField sortField) {
        this.sortField = sortField;
    }
}
