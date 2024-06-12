import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
        initializeLibrary();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    private void initializeLibrary() {
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        books.add(new Book("Moby-Dick", "Herman Melville", 1851));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("War and Peace", "Leo Tolstoy", 1869));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        books.add(new Book("Jane Eyre", "Charlotte Bronte", 1847));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932));
        books.add(new Book("The Adventures of Huckleberry Finn", "Mark Twain", 1884));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997));
        books.add(new Book("The Hunger Games", "Suzanne Collins", 2008));
        books.add(new Book("The Book Thief", "Markus Zusak", 2005));
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

}

class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
}
