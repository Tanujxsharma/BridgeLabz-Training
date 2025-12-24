
public class Books {

    String title;
    String author;
    int prize;

    Books(String title, String author, int prize) {
        this.title = title;
        this.author = author;
        this.prize = prize;
    }

    Books() {
    }

    public static void main(String[] args) {

        Books book = new Books("meri javani  ", "Tanuj sharma", 150);
    }

}
