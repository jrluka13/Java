package Controller;

import Book.Book;
import Book.Builder;
import Book.Num_books;
import Logic.Logic;
import Outer.Outer;

public class Controller {

    public void control(){

        Builder builder = new Builder();
        Num_books num = builder.build();

        Book[] books = {num.getBook1(),num.getBook2(),num.getBook3()};

        Outer.show(num.toString());
        Outer.show("-----------------------------------------------------------------------------------------------------------------------------");
        Logic.find_books(books);
        Outer.show("-----------------------------------------------------------------------------------------------------------------------------");
        Logic.find_books_zadIzd(books);
        Outer.show("-----------------------------------------------------------------------------------------------------------------------------");
        Logic.find_books_zadYear(books);
    }

}
