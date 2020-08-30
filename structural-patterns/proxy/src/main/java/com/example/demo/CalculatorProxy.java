package com.example.demo;

import java.util.HashMap;

public class CalculatorProxy implements Calculator {

    private HashMap<String, Integer> requests = new HashMap<>();
    private CalculatorFacade calculatorFacade = new CalculatorFacade();

    @Override
    public int add(int a, int b) {
        var key = createKey(a, b, "+");
        if (requests.containsKey(key)) {
            return requests.get(key);
        } else {
            int result = calculatorFacade.add(a, b);
            this.requests.put(key, result);
            return result;
        }
    }

    @Override
    public int divide(int a, int b) {
        var key = createKey(a, b, "/");
        if (requests.containsKey(key)) {
            return requests.get(key);
        } else {
            int result = calculatorFacade.divide(a, b);
            this.requests.put(key, result);
            return result;
        }
    }

    @Override
    public int multiply(int a, int b) {
        var key = createKey(a, b, "*");
        if (requests.containsKey(key)) {
            return requests.get(key);
        } else {
            int result = calculatorFacade.multiply(a, b);
            this.requests.put(key, result);
            return result;
        }
    }

    @Override
    public int subtract(int a, int b) {
        var key = createKey(a, b, "-");
        if (requests.containsKey(key)) {
            return requests.get(key);
        } else {
            int result = calculatorFacade.subtract(a, b);
            this.requests.put(key, result);
            return result;
        }
    }

    private String createKey(int a, int b, String operation) {
        return a + operation + b;
    }
}
