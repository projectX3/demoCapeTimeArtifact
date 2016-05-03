package demo.business;

import demo.model.Tblcustomer;

public class CreateCustomer {

    public Tblcustomer createCustomer(String name) {
        Tblcustomer customer = new Tblcustomer();
        customer.setCustomer(name);
        return customer;
    }
}
