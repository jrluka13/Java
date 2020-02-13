package Book;

public class Num_books {

    private Book book1;
    private Book book2;
    private Book book3;

    public Num_books(Book book1, Book book2, Book book3) {
        this.book1 = book1;
        this.book2 = book2;
        this.book3 = book3;
    }

    public Book getBook1() {
        return book1;
    }

    public void setBook1(Book book1) {
        this.book1 = book1;
    }

    public Book getBook2() {
        return book2;
    }

    public void setBook2(Book book2) {
        this.book2 = book2;
    }

    public Book getBook3() {
        return book3;
    }

    public void setBook3(Book book3) {
        this.book3 = book3;
    }

    @Override
    public String toString() {
        return  "book1=" + book1 +
                "book2=" + book2 +
                "book3=" + book3 + "\n";
    }
}
