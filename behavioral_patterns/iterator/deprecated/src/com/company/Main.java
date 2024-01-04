package behavioral_patterns.iterator.deprecated.src.com.company;

public class Main {

    public static void main(String[] args) {
	    var bookList = new BookList();
        bookList.add(new Book("selindzher", "The Catcher in the Rye", 1951));
        bookList.add(new Book("ray bradberri", "Fahrenheit 451", 1953));
	    bookList.sortBy(SortField.AUTHOR_NAME);
	    for (var book : bookList) {
            System.out.println(book.getAuthorName());
        }
    }
}
