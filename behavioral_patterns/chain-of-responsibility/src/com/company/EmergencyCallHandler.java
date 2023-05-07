package com.company;

import com.company.entities.Accident;

public interface EmergencyCallHandler {
    void setNextHandler(BaseEmergencyCallHandler nextHandler);
    void handle(Accident accident);
}
