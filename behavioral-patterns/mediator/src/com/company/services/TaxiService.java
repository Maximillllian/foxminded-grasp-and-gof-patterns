package com.company.services;

import com.company.Service;

public class TaxiService implements Service {
    @Override
    public void call(String message) {
        System.out.println("taxi is coming");
    }
}
