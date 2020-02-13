package Book;

import Inputer.Inputer;

public class Builder {

    public Num_books build(){

        Book book1 = new Book(Inputer.inputInt(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputInt(),Inputer.inputInt(),Inputer.inputInt(),Inputer.inputLine());
        Book book2 = new Book(Inputer.inputInt(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputInt(),Inputer.inputInt(),Inputer.inputInt(),Inputer.inputLine());
        Book book3 = new Book(Inputer.inputInt(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputInt(),Inputer.inputInt(),Inputer.inputInt(),Inputer.inputLine());

        Num_books num = new Num_books(book1,book2,book3);

        return num;

    }
}
