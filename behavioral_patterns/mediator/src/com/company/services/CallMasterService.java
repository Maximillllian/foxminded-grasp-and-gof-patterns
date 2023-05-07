package behavioral_patterns.mediator.src.com.company.services;

import behavioral_patterns.mediator.src.com.company.Service;

public class CallMasterService implements Service {
    @Override
    public void call(String message) {
        System.out.println("calling the master at home");
    }
}
