package Customer;


import Inputer.Inputer;

public class Builder {

    public NumsOfCustomer build(){


        Customer customer1 = new Customer(Inputer.inputInt(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputInt(),Inputer.inputInt());
        Customer customer2 = new Customer(Inputer.inputInt(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputInt(),Inputer.inputInt());
        Customer customer3 = new Customer(Inputer.inputInt(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputInt(),Inputer.inputInt());


        return new NumsOfCustomer(customer1,customer2,customer3);
    }

}
