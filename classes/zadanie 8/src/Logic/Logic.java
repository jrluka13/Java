package Logic;

import Customer.Customer;
import Inputer.Inputer;
import Outer.Show;

public class Logic {

    public static Customer[] sort(Customer[] customers) {

        for (int i = 0; i < customers.length; i++) {
            for (int j = i + 1; j < customers.length; j++) {
                if (customers[i].getLastName().compareTo(customers[j].getLastName()) > 0) {
                    Customer customer = customers[j];
                    customers[j] = customers[i];
                    customers[i] = customer;
                }
            }
        }

        return customers;
    }

    public static void show_OnCard(Customer[] customers) {
        System.out.println("Enter m: ");
        int m = Inputer.inputInt();
        System.out.println("Enter k: ");
        int k = Inputer.inputInt();

        for (int i = 0; i < customers.length; i++) {
            if (m < customers[i].getNumOfCard() && k > customers[i].getNumOfCard()) {
                Show.show(customers[i].getLastName());
            }

        }
    }
}
