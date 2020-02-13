package Customer;

public class NumsOfCustomer {

    private Customer customer1;
    private Customer customer2;
    private Customer customer3;

    public NumsOfCustomer(Customer customer1, Customer customer2, Customer customer3) {
        this.customer1 = customer1;
        this.customer2 = customer2;
        this.customer3 = customer3;
    }

    public Customer getCustomer1() {
        return customer1;
    }

    public void setCustomer1(Customer customer1) {
        this.customer1 = customer1;
    }

    public Customer getCustomer2() {
        return customer2;
    }

    public void setCustomer2(Customer customer2) {
        this.customer2 = customer2;
    }

    public Customer getCustomer3() {
        return customer3;
    }

    public void setCustomer3(Customer customer3) {
        this.customer3 = customer3;
    }

    @Override
    public String toString() {
        return  "customer1= " + customer1 +
                "\n customer2= " + customer2 +
                "\n customer3= " + customer3 ;
    }
}
