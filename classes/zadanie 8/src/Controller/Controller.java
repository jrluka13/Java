package Controller;

import Customer.Builder;
import Customer.Customer;
import Customer.NumsOfCustomer;
import Logic.Logic;
import Outer.Show;

public class Controller {

    public  void control(){
        Builder builder = new Builder();
        NumsOfCustomer nums = builder.build();
        Customer[] customers = {nums.getCustomer1(),nums.getCustomer2(),nums.getCustomer3()};
        Show.show(nums.toString());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        Show.show(Logic.sort(customers));
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        Logic.show_OnCard(customers);


    }

}
