package behavioral_patterns.mediator.deprecated.src.com.company.services;

import behavioral_patterns.mediator.deprecated.src.com.company.Service;

public class FlowersDeliveryService implements Service {
    @Override
    public void call(String message) {
        System.out.println("delivering flowers");
    }
}
