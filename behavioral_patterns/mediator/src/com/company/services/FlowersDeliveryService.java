package com.company.services;

import com.company.Service;

public class FlowersDeliveryService implements Service {
    @Override
    public void call(String message) {
        System.out.println("delivering flowers");
    }
}
