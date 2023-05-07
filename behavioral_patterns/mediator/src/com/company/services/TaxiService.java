package behavioral_patterns.mediator.src.com.company.services;

import behavioral_patterns.mediator.src.com.company.Service;

public class TaxiService implements Service {
    @Override
    public void call(String message) {
        System.out.println("taxi is coming");
    }
}
