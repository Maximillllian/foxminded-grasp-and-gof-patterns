package behavioral_patterns.mediator.service;

import behavioral_patterns.mediator.Customer;
import behavioral_patterns.mediator.Service;

public class TaxiService implements Service {

    @Override
    public void call(Customer customer) {
        System.out.println("Customer " + customer + " call taxi");
    }
}
