import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class QnA {
    Library library = new Library();

    public QnA() {
        library = new Library();
    }

    // 1. Using streams, how would you find the titles of all the books published after 2000?
    public void booksAfter2000() {
        List<String> titles = library.getBooks()
                .stream()
                .filter(book -> book.getYearPublished() > 2000)
                .map(Book::getTitle)
                .collect(Collectors.toList());
        System.out.println(titles);
    }

    // 2. Can you demonstrate how to filter the books written by a specific author (Mark Twain) using streams?
    public void filterSpecificAuthor() {
        List<Book> booksByAuthor = library.getBooks()
                .stream()
                .filter(book -> book.getAuthor().equals("Mark Twain"))
                .collect(Collectors.toList());
        System.out.println(booksByAuthor);
    }

    //3. Implement a stream operation to calculate the total number of pages in the library, assuming each book has 200 pages.
    public void totalPages() {
        int totalPages = library.getBooks()
                .stream()
                .mapToInt(book -> 200)
                .sum();
        System.out.println(totalPages);
    }

    //4. How would you use streams to find the book with the earliest publication year?
    public void earliestPublication() {
        Optional<Book> earliestBook = Optional.of(library.getBooks()
                .stream()
                .min(Comparator.comparingInt(Book::getYearPublished)).get());
        System.out.println(earliestBook);
    }

    //5. Demonstrate the use of streams to count the number of books written by each author.
    public void countOfBooks() {
        Map<String, Long> collect = library.getBooks()
                .stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
        System.out.println(collect);
    }

    //6. Write a stream operation to sort the books in the library based on their publication year.
    public void sortedBooksByYear() {
        List<Book> sortedBooks = library.getBooks()
                .stream()
                .sorted(Comparator.comparingInt(Book::getYearPublished))
                .collect(Collectors.toList());
        System.out.println(sortedBooks);
    }

    //7. Can you show how to use streams to find the average publication year of all the books?
    public void averageYearOfPublication() {
        OptionalDouble averageYear = library.getBooks()
                .stream()
                .mapToInt(Book::getYearPublished)
                .average();
        System.out.println(averageYear);
    }

    //8. Implement a stream operation to filter out duplicate books based on their title.
    public void uniqueBooks() {
        List<Book> uniqueBooks = library.getBooks()
                .stream()
                .collect(Collectors.toMap(Book::getTitle, Function.identity(), (existing, replacement) -> existing))
                .values()
                .stream()
                .collect(Collectors.toList());
        System.out.println(uniqueBooks);
    }

    //9. Write a stream operation to convert the titles of all the books to uppercase.
    public void uppercaseTitles() {
        List<String> uppercaseTitles = library.getBooks()
                .stream()
                .map(Book::getTitle)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseTitles);
    }

    //10. How would you use streams to concatenate all the book titles into a single string, separated by commas?
    public void concatTitles() {
        String concatenatedTitles = library.getBooks()
                .stream()
                .map(Book::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(concatenatedTitles);
    }

    //11. Write a stream operation to create a summary of publication years (count, sum, min, average, max).
    public void publicationYearSummary() {
        IntSummaryStatistics publicationYearSummary = library.getBooks()
                .stream()
                .collect(Collectors.summarizingInt(Book::getYearPublished));

        System.out.println(publicationYearSummary);
    }

    //12. How can you find authors who have written more than one book?
    public void authorBookCounts() {
        Map<String, Long> authorBookCounts = library.getBooks()
                .stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
        List<String> authorsWithMultipleBooks = authorBookCounts.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(authorsWithMultipleBooks);
    }

    //13. How can you partition the books into those published before and after the year 2000?
    public void partitionedBooks() {
        Map<Boolean, List<Book>> partitionedBooks = library.getBooks()
                .stream()
                .collect(Collectors.partitioningBy(book -> book.getYearPublished() >= 2000));
        System.out.println("Books published before 2000: " + partitionedBooks.get(false));
        System.out.println("Books published after 2000: " + partitionedBooks.get(true));

    }

    //14. How can you convert the list of books to a map where the title is the key and the year published is the value?
    public void titleToYearMap() {
        Map<String, Integer> titleToYearMap = library.getBooks()
                .stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getYearPublished));
        titleToYearMap.forEach((title, year) -> {
            System.out.println(title + ": " + year);
        });
    }

    //15. How can you get a list of authors in alphabetical order, with no duplicates?
    public void authors() {
        List<String> authors = library.getBooks()
                .stream()
                .map(Book::getAuthor)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(authors);
    }

}
