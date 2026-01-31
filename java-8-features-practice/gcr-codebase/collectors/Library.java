import java.util.*;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String genre;
    private int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}

public class Library {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Clean Code", "Programming", 464),
                new Book("Effective Java", "Programming", 416),
                new Book("The Hobbit", "Fantasy", 310),
                new Book("Harry Potter", "Fantasy", 500),
                new Book("Sapiens", "History", 443),
                new Book("Guns, Germs, and Steel", "History", 480)
        );

        Map<String, IntSummaryStatistics> bookStatsByGenre = books.stream().collect(Collectors.groupingBy(
                             Book::getGenre,
                             Collectors.summarizingInt(Book::getPages)
                     ));

        bookStatsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages   : " + stats.getSum());
            System.out.println("  Average Pages : " + stats.getAverage());
            System.out.println("  Max Pages     : " + stats.getMax());
        });
    }
}