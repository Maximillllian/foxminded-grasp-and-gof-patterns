package com.company;

import com.company.entities.Accident;
import com.company.entities.Fire;

public class FireDepartment extends BaseEmergencyCallHandler {

    @Override
    public void handle(Accident accident) {
        if (canHandle(accident)) {
            System.out.println("putting out the fire");
        }
        else {
            super.handle(accident);
        }
    }

    private boolean canHandle(Accident accident) {
        return accident instanceof Fire;
    }
}
