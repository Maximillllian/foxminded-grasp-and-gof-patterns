package com.company.services;

import com.company.Service;

public class CallMasterService implements Service {
    @Override
    public void call(String message) {
        System.out.println("calling the master at home");
    }
}
