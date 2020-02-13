package Logic;

import Book.Book;
import Book.Num_books;
import Inputer.Inputer;
import Outer.Outer;

public class Logic {

    public static void find_books(Book[] books){

        System.out.println("Enter author: ");
        String str = Inputer.inputLine();

        for (int i = 0; i <books.length ; i++) {
            if(books[i].getAuthor().equals(str)){
                Outer.show(books[i].getName());
            }
        }

    }

    public static void find_books_zadIzd(Book[] books){

        System.out.println("Enter zad_izdatelstvo: ");
        String str = Inputer.inputLine();

        for (int i = 0; i <books.length ; i++) {
            if(books[i].getPubl().equals(str)){
                Outer.show(books[i].getName());
            }
        }

    }

    public static void find_books_zadYear(Book[] books){

        System.out.println("Enter zad_year: ");
        int year = Inputer.inputInt();

        for (int i = 0; i <books.length ; i++) {
            if(books[i].getYear() == year){
                Outer.show(books[i].getName());
            }
        }

    }

}
