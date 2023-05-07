package com.company;

import com.company.entities.Accident;
import com.company.entities.Crime;

public class Police extends BaseEmergencyCallHandler {

    @Override
    public void handle(Accident accident) {
        if (canHandle(accident)) {
            System.out.println("killing enemies");
        }
        super.handle(accident);
    }

    private boolean canHandle(Accident accident) {
        return accident instanceof Crime;
    }
}
